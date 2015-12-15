package io.bymbl.api.shop.model;

/**
 * Author: lars
 * Since: 15-12-15.
 */
public class Product {

    private long id;
    private String name;

    public Product() {
    }

    public Product(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

}