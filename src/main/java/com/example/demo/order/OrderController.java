package com.example.demo.order;

import com.example.demo.item.Item;
import com.example.demo.item.ItemRepository;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/orders")
public class OrderController {

    private final OrderRepository orderRepository;
    private final ItemRepository itemRepository;

    public OrderController(OrderRepository orderRepository,
                           ItemRepository itemRepository) {
        this.orderRepository = orderRepository;
        this.itemRepository = itemRepository;
    }


    @GetMapping("/{id}")
    public Optional<Order> getOrder(@PathVariable Long id) {
        return orderRepository.findById(id);
    }

    @PostMapping
    public void postOrder(Order order) {
        orderRepository.save(order);
    }

    @PostMapping("/{id}")
    public Item postItem(@PathVariable Long id, @RequestBody Item item) {
        Order order = orderRepository.findById(id).get();
        item.setOrder(order);

        return itemRepository.save(item);
    }
//
//    @GetMapping("/order/{id}")
//    List<Item> getOrder(@PathVariable Long id) {
//        return orderRepository.findAllItems(id);
//    }


}
