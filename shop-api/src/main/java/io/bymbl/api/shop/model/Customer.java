package io.bymbl.api.shop.model;

/**
 * Author: lars
 * Since: 15-12-15.
 */
public class Customer {

    private long id;
    private String name;

    public Customer() {
    }

    public Customer(long id, String name) {
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
