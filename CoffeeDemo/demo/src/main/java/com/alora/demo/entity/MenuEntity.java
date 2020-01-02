package com.alora.demo.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class MenuEntity {

    @Id
    private int id;

    private String product;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "MenuEntity{" +
                "id=" + id +
                ", product='" + product + '\'' +
                '}';
    }
}
