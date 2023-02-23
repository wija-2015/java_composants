package com.omniacademy.formation.practice4;

import java.math.BigDecimal;

import static java.math.RoundingMode.HALF_UP;

/**
 * @author Wijdane KHATTAT
 */
public class Product {
    private int id;
    private String name;
    private BigDecimal price;

    public static final BigDecimal DISCOUNT_RATE=BigDecimal.valueOf(0.1);



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(final BigDecimal price) {
        //price = BigDecimal.TEN;
        this.price = price;
    }

    public BigDecimal getDiscount() {
        return price.multiply(DISCOUNT_RATE).setScale(2,HALF_UP);
    }
}
