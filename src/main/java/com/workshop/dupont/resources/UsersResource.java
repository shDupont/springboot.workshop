package com.workshop.dupont.resources;

import com.workshop.dupont.entities.Users;
import com.workshop.dupont.services.UsersServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping( value = "/users" )
public class UsersResource {
    @Autowired
    private UsersServices usersServices;

    @GetMapping
    public ResponseEntity<List<Users>> findAll(){
        List<Users> list = usersServices.findAll();
        return ResponseEntity.ok().body(list);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Users> findById(@PathVariable Long id){
        Users obj = usersServices.findById(id);
        return ResponseEntity.ok().body(obj);
    }

    @PostMapping
    public ResponseEntity<Users> insert(@RequestBody Users obj){
        obj = usersServices.insert(obj);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();
        return ResponseEntity.created(uri).body(obj);
    }

    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        usersServices.delete(id);
        return ResponseEntity.noContent().build();
    }
}
