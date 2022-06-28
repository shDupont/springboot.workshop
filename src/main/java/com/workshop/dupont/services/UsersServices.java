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

    public Users insert(Users obj){
        return usersRepository.save(obj);
    }

    public void delete(Long id){
        usersRepository.deleteById(id);
    }

    public Users update(Long id, Users obj){
        Users entity = usersRepository.getReferenceById(id);
        updateData(entity, obj);
        return usersRepository.save(entity);
    }

    private void updateData(Users entity, Users obj) {
        entity.setName(obj.getName());
        entity.setEmail(obj.getEmail());
        entity.setPhone(obj.getPhone());
    }
}
