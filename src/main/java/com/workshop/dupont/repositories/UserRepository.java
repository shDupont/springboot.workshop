package com.workshop.dupont.repositories;

import com.workshop.dupont.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
