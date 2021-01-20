package com.example.demo.order;

import com.example.demo.item.Item;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {

    private final OrderRepository orderRepository;

    public OrderController(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }


    @GetMapping("/order/{id}")
    String getOrder(@PathVariable Long id) {
        return "xd: " + id;
    }
//    @GetMapping("/order/{id}")
//    List<Item> getOrder(@PathVariable Long id) {
//        return orderRepository.findAllItems(id);
//    }


}
