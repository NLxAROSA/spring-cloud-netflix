package io.bymbl.api.shop.model;

/**
 * Author: lars
 * Since: 15-12-15.
 */
public class CustomerProduct {

    private final long id;
    private final String name;
    private final long productId;
    private final String productName;

    public CustomerProduct(String productName, long productId, String name, long id) {
        this.productName = productName;
        this.productId = productId;
        this.name = name;
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public long getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }
}
