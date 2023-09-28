package com.demo3.demo3.model;

import com.demo3.demo3.entity.BrandEnum;
import com.demo3.demo3.entity.CurrencyEnum;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "product_data")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "id_generator")
    private long id;

    private BrandEnum brand;

    private String name;

    private int price;

    private CurrencyEnum currency;

    public Product(BrandEnum brand, String name, int price, CurrencyEnum currency) {
        this.brand = brand;
        this.name = name;
        this.price = price;
        this.currency = currency;
    }
}
