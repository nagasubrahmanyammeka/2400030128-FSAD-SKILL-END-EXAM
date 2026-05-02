package com.klef.fsad.exam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.klef.fsad.exam.model.Ordermodel;
import com.klef.fsad.exam.services.OrderServices;

@RestController
@RequestMapping("/orders")
@CrossOrigin("*")
public class OrderController {

    @Autowired
    private OrderServices service;

    @PostMapping
    public Ordermodel addOrder(@RequestBody Ordermodel order) {
        return service.addOrder(order);
    }

    @GetMapping
    public List<Ordermodel> getAllOrders() {
        return service.getAllOrders();
    }

    @GetMapping("/{id}")
    public Ordermodel getOrderById(@PathVariable int id) {
        return service.getOrderById(id);
    }

    
}