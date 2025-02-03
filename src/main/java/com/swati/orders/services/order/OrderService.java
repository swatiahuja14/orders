package com.swati.orders.services.order;


import com.swati.orders.common.types.Order;

import java.util.List;

public interface OrderService {
    // Save operation
    Order saveOrder(Order order);

    // Read operation
    List<Order> fetchOrdersList();

    List<Order> getOrder(long id);

    // Update operation
    Order updateOrder(Order order,
                                Long orderId);

    // Delete operation
    void deleteOrderById(Long orderId);
}
