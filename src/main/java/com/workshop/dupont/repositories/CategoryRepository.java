package com.workshop.dupont.repositories;

import com.workshop.dupont.entities.Category;
import com.workshop.dupont.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
