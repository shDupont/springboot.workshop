package com.workshop.dupont.repositories;

import com.workshop.dupont.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
