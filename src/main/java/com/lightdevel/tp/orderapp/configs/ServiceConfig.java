package com.lightdevel.tp.orderapp.configs;

import com.lightdevel.tp.orderapp.models.entities.Order;
import com.lightdevel.tp.orderapp.repositories.OrderRepository;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackageClasses = { OrderRepository.class })
@EntityScan(basePackageClasses = { Order.class })
public class ServiceConfig {
}
