package com.omniacademy.formation.practice4;

import java.util.List;

/**
 * @author Wijdane KHATTAT
 */
public class Client {
    private String firstName;
    private String lastName;
    List<Product> productList;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }
}
