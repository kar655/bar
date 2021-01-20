package com.example.demo;

import com.example.demo.item.Item;
import com.example.demo.item.ItemRepository;
import com.example.demo.order.Order;
import com.example.demo.order.OrderRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Bean
    public CommandLineRunner initDemo(OrderRepository orderRepository,
                                      ItemRepository itemRepository) {
        return args -> {
            Order order = new Order();
            orderRepository.save(order);

//            itemRepository.save(new Item("Apple"));
//            itemRepository.save(new Item("Banana"));
//            itemRepository.save(new Item("Watermelon"));
            itemRepository.save(new Item("Apple", order));
            itemRepository.save(new Item("Banana", order));
            itemRepository.save(new Item("Watermelon", order));
        };
    }

}
