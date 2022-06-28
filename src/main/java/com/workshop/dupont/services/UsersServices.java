package com.workshop.dupont.services;

import com.workshop.dupont.entities.Users;
import com.workshop.dupont.repositories.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsersServices {
    @Autowired
    private UsersRepository usersRepository;

    public List<Users> findAll(){
        return usersRepository.findAll();
    }

    public Users findById(Long id){
        Optional<Users> obj = usersRepository.findById(id);
        return obj.get();
    }
}
