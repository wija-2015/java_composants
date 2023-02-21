package com.omniacademy.formation.practice5;

import java.math.BigDecimal;
import java.util.Objects;

import static java.math.RoundingMode.HALF_UP;

/**
 * @author Wijdane KHATTAT
 */
public class Product {
    private int id;
    private String name;
    private BigDecimal price;

    private Rating rating;

    public static final BigDecimal DISCOUNT_RATE=BigDecimal.valueOf(0.1);

    public Product() {
        this(1, "X", BigDecimal.ONE);
    }

    public Product(int id, String name, BigDecimal price) {
        this(id, name, price, Rating.NOT_RATED);
    }

    public Product(int id, String name, BigDecimal price, Rating rating) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    public int getId() {
        return id;
    }

    /*public void setId(int id) {
        this.id = id;
    }*/

    public String getName() {
        return name;
    }

    /*public void setName(String name) {
        this.name = name;
    }*/

    public BigDecimal getPrice() {
        return price;
    }

    /*public void setPrice(final BigDecimal price) {
        //price = BigDecimal.TEN;
        this.price = price;
    }*/

    public BigDecimal getDiscount() {
        return price.multiply(DISCOUNT_RATE).setScale(2,HALF_UP);
    }

    public Rating getRating() {
        return rating;
    }

    public void setRating(Rating rating) {
        this.rating = rating;
    }

    public Product applyRating(Rating rating){
        return new Product(this.id, this.name, this.price, rating);
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", rating=" + rating +
                '}';
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
