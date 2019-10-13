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
public class Invoice {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String number;

    @OneToMany(
            mappedBy = "invoice",
            cascade = CascadeType.ALL
    )
    private List<Item> items = new ArrayList<>();

    public Invoice(String number) {
        this.number = number;
    }
}
