package com.lightdevel.tp.orderapp.services;

import com.lightdevel.tp.orderapp.models.OrderStatus;
import com.lightdevel.tp.orderapp.models.enums.Status;

public interface OrderService {
    OrderStatus getStatus(String orderId);

    OrderStatus setStatus(String orderId, Status status);
}
