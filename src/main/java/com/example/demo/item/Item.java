package com.example.demo.item;

import com.example.demo.order.Order;

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

    public Item() {

    }

    public Item(String description) {
        this.description = description;
    }

    public Item(Long id, String description) {
        this.id = id;
        this.description = description;
    }

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
}
