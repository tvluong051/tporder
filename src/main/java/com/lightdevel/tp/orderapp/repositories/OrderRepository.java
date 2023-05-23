package com.lightdevel.tp.orderapp.repositories;

import com.lightdevel.tp.orderapp.models.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, String> {
}
