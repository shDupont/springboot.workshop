package com.workshop.dupont.repositories;

import com.workshop.dupont.entities.OrderItem;
import com.workshop.dupont.entities.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
