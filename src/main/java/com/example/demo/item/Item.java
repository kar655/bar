package com.example.demo.item;

import com.example.demo.order.Order;
import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

@Entity
@Table(name = "items")
public class Item {
    @Id
    @SequenceGenerator(name = "items_sequence")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "items_sequence")
    private Long id;

    @Column(nullable = false)
    private String description;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "order_id", nullable = false)
    private Order order;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Item() {

    }

    public Item(Long id, String description, Order order) {
        this.id = id;
        this.description = description;
        this.order = order;
    }

    public Item(String description, Order order) {
        this.description = description;
        this.order = order;
    }

//    public Item(String description) {
//        this.description = description;
//    }
//
//    public Item(Long id, String description) {
//        this.id = id;
//        this.description = description;
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getDescription() {
//        return description;
//    }
//
//    public void setDescription(String description) {
//        this.description = description;
//    }
}
