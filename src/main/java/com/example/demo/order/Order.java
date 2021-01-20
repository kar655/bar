package com.example.demo.order;

import com.example.demo.item.Item;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "orders")
public class Order {
    @Id
    @SequenceGenerator(name = "orders_sequence")
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "orders_sequence")
    private Long id;

    @JsonManagedReference
    @OneToMany(mappedBy = "order")
    private List<Item> items;

    public Order() {
    }

    public Order(List<Item> items) {
        this.items = items;
    }

    public Order(Long id, List<Item> items) {
        this.id = id;
        this.items = items;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
}
