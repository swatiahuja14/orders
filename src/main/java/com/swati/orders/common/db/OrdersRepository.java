package com.swati.orders.common.db;

import com.swati.orders.common.types.Order;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

// Annotation
@Repository
// Interface extending CrudRepository
public interface OrdersRepository
        extends CrudRepository<Order, Long> {
}


