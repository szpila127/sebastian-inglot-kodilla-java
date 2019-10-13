package com.kodilla.hibernate.invoice;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private List<Item> items = new ArrayList<>();

    @OneToMany(mappedBy = "product")
    public List<Item> getItems() {
        return items;
    }

    public Product(String name) {
        this.name = name;
    }
}
