package com.JoabeJW.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.JoabeJW.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
