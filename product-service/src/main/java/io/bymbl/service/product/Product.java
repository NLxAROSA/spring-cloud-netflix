package io.bymbl.service.product;

/**
 * Author: lars
 * Since: 14-12-15.
 */
public class Product {

    private long id;
    private String name;


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
