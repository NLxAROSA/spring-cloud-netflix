package io.bymbl.api.shop;

import io.bymbl.api.shop.clients.CustomerClient;
import io.bymbl.api.shop.clients.ProductClient;
import io.bymbl.api.shop.model.Customer;
import io.bymbl.api.shop.model.CustomerProduct;
import io.bymbl.api.shop.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.security.SecureRandom;

/**
 * Author: lars
 * Since: 15-12-15.
 */
@RestController
public class ShopApi {

    private final ProductClient productClient;
    private final CustomerClient customerClient;

    @Autowired
    public ShopApi(ProductClient productClient, CustomerClient customerClient) {
        this.productClient = productClient;
        this.customerClient = customerClient;
    }

    @RequestMapping("/")
    public CustomerProduct getCustomerProduct(@RequestParam("id") long id)  {
        Customer customer = customerClient.getCustomer(id);
        Product product = productClient.getProduct(new SecureRandom().nextLong());

        return new CustomerProduct(product.getName(), product.getId(), customer.getName(), customer.getId());
    }

}
