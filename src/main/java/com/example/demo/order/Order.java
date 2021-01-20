package com.example.demo.order;

import com.example.demo.item.Item;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue
    private Long id;

//    @OneToMany(mappedBy = "order_id")
//    private List<Item> items;

    public Order() {
    }

}
