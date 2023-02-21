package com.omniacademy.formation.practice4;

import java.math.BigDecimal;

/**
 * @author Wijdane KHATTAT
 */
public class Shop {

    /**
     * arg input Strin array
     * @param args
     */
    public static void main(String[] args) {

        Product p1 = new Product();
        p1.setId(99);
        p1.setName("Armoire");
        p1.setPrice(BigDecimal.valueOf(1000));
        System.out.println(p1.getId() +" "+ p1.getName()+ " "+p1.getPrice()+" "+p1.getDiscount());

    }
}
