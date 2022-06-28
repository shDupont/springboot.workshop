package com.workshop.dupont.repositories;

import com.workshop.dupont.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
