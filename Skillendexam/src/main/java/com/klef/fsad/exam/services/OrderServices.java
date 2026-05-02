package com.klef.fsad.exam.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.fsad.exam.model.Ordermodel;
import com.klef.fsad.exam.repo.OrderRepo;

@Service
public class OrderServices {

    @Autowired
    private OrderRepo repo;

    public Ordermodel addOrder(Ordermodel order) {
        return repo.save(order);
    }

    public List<Ordermodel> getAllOrders() {
        return repo.findAll();
    }
    
    public Ordermodel getOrderById(int id) {
        Optional<Ordermodel> order = repo.findById(id);
        return order.orElse(null);
    }

    
}