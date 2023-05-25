package com.example.springsecurityapplication.services;

import com.example.springsecurityapplication.enumm.Status;
import com.example.springsecurityapplication.models.Order;
import com.example.springsecurityapplication.models.Product;
import com.example.springsecurityapplication.repositories.OrderRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional(readOnly = true)
public class OrderSevice {
    private final OrderRepository orderRepository;

    public OrderSevice(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }


    // Данный метод позволяет получить список всех заказов
    public List<Order> getAllOrder(){
        return orderRepository.findAll();
    }


    //Позволяет найти заказ по id
    public Order getOrderId(int id){
        Optional<Order> optionalOrder = orderRepository.findById(id);
        return optionalOrder.orElse(null);
    }


   //Метод позволяет обновить данные о заказе
    @Transactional
    public void updateOrder(int id, Order order){
        order.setId(id);
        orderRepository.save(order);
    }
}
