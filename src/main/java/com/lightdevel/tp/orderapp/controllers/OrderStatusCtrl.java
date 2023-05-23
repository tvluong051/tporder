package com.lightdevel.tp.orderapp.controllers;

import com.lightdevel.tp.orderapp.models.OrderStatus;
import com.lightdevel.tp.orderapp.models.enums.Status;
import com.lightdevel.tp.orderapp.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

@RestController("/orders")
public class OrderStatusCtrl {

    private OrderService orderService;
    @Autowired
    public OrderStatusCtrl(OrderService orderService) {
        this.orderService = Objects.requireNonNull(orderService);
    }

    @GetMapping("/{orderId}/status")
    public OrderStatus getOrderStatusById(@PathVariable("orderId") String orderId) {
        return orderService.getStatus(orderId);
    }

    @PostMapping("/{orderId}/status")
    public OrderStatus setOrderStatusById(@PathVariable("orderId") String orderId, @RequestParam("status") Status status) {
        return orderService.setStatus(orderId, status);
    }
}
