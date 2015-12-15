package io.bymbl.service.customer;

/**
 * Author: lars
 * Since: 14-12-15.
 */
public class Customer {

    private long id;
    private String name;


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
