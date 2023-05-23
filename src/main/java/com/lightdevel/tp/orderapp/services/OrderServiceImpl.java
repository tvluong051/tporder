package com.lightdevel.tp.orderapp.services;

import com.lightdevel.tp.orderapp.models.OrderStatus;
import com.lightdevel.tp.orderapp.models.entities.Order;
import com.lightdevel.tp.orderapp.models.enums.Status;
import com.lightdevel.tp.orderapp.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.mail.MailSender;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public OrderStatus getStatus(String orderId) {
        Order order = orderRepository.getOne(orderId);
        if (order == null) {
            return null;
        }
        return OrderStatus.builder()
                .orderId(order.getOrderId())
                .status(Status.fromString(order.getStatus()))
                .build();
    }

    @Override
    public OrderStatus setStatus(String orderId, Status status) {
        Order order = orderRepository.getOne(orderId);
        if (order == null) {
            return null;
        }
        order.setStatus(status.name());
        Order savedOrder = orderRepository.save(order);
        return OrderStatus.builder()
                .orderId(savedOrder.getOrderId())
                .status(status)
                .build();
    }
}
