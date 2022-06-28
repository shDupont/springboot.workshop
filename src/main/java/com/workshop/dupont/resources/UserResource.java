package com.workshop.dupont.resources;

import com.workshop.dupont.entities.Users;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping( value = "/users" )
public class UserResource {

    @GetMapping
    public ResponseEntity<Users> findAll(){
        Users user = new Users(1L, "Maria", "maria@gmail.com", "999999999", "12345");
        return ResponseEntity.ok().body(user);
    }
}
