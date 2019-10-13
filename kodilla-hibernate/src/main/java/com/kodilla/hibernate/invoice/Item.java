package com.kodilla.hibernate.invoice;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "PRODUCT_ID")
    private Product product;

    @ManyToOne
    @JoinColumn(name = "INVOICE_ID")
    private Invoice invoice;

    private BigDecimal price;
    private int quantity;
    private BigDecimal value;

    public Item(BigDecimal price, int quantity, BigDecimal value) {
        this.price = price;
        this.quantity = quantity;
        this.value = value;
    }
}
