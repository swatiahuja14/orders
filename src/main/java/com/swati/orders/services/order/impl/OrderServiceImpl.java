package com.swati.orders.services.order.impl;

import com.swati.orders.common.db.OrdersRepository;
import com.swati.orders.common.types.Order;
import com.swati.orders.services.order.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrdersRepository ordersRepository;

    @Override
    public Order saveOrder(Order order) {
        return ordersRepository.save(order);
    }

    @Override
    public List<Order> fetchOrdersList() {
        return (List<Order>) ordersRepository.findAll();
    }

    @Override
    public List<Order> getOrder(long id) {
        System.out.println("Service calling Repo "+id);
        return (List<Order>)ordersRepository.findById(id).get();
    }

    @Override
    public Order updateOrder(Order order, Long orderId) {
        Order newO = ordersRepository.findById(orderId).get();
        return ordersRepository.save(newO);
    }

    @Override
    public void deleteOrderById(Long orderId) {
        ordersRepository.deleteById(orderId);
    }
}
