package com.omniacademy.formation.practice6;

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

        Product p1 = new Product(101,"Tea",BigDecimal.valueOf(1.99));
        System.out.println(p1.getId()+" "+p1.getName() +" "+p1.getPrice()+" "+p1.getDiscount()+" "+ p1.getRating().getStars());

        Product p2 = new Product(102,"Coffee",BigDecimal.valueOf(1.99), Rating.FOUR_STAR);
        System.out.println(p2.getId()+" "+p2.getName()+" "+p2.getPrice()
                +" "+p2.getDiscount()+" "+p2.getRating().getStars());

        Product p3 = new Product(103,"Cake",BigDecimal.valueOf(3.99), Rating.FIVE_STAR);
        System.out.println(p3.getId()+" "+p3.getName()+" "+p3.getPrice()
                +" "+p3.getDiscount()+" "+p3.getRating().getStars());

        Product p4 = new Product();
        System.out.println(p4.getId()+" "+p4.getName()+" "+p4.getPrice()
                +" "+p4.getDiscount()+" "+p4.getRating().getStars());

        p1 = p1.applyRating(Rating.TWO_STAR);
        System.out.println(p1.getId()+" "+p1.getName() +" "+p1.getPrice()+" "+p1.getDiscount()+" "+ p1.getRating().getStars());
        System.out.println(p1.getRating());


        System.out.println("");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);



    }
}
