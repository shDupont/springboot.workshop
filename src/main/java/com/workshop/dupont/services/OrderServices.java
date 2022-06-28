package com.workshop.dupont.services;

import com.workshop.dupont.entities.Order;
import com.workshop.dupont.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderServices {
    @Autowired
    private OrderRepository OrdersRepository;

    public List<Order> findAll(){
        return OrdersRepository.findAll();
    }

    public Order findById(Long id){
        Optional<Order> obj = OrdersRepository.findById(id);
        return obj.get();
    }
}
