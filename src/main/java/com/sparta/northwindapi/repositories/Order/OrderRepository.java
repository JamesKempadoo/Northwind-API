package com.sparta.northwindapi.repositories.Order;

import com.sparta.northwindapi.entities.Order.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Integer> {
}
