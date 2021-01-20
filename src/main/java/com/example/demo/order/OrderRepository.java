package com.example.demo.order;

import com.example.demo.item.Item;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends CrudRepository<Order, Long> {

//    List<Item> findAllItems(Long orderId);
}
