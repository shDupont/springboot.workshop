package com.workshop.dupont.resources;

import com.workshop.dupont.entities.Users;
import com.workshop.dupont.services.UsersServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
