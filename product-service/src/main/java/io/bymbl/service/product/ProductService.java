package io.bymbl.service.product;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author: lars
 * Since: 14-12-15.
 */
@RestController
public class ProductService {

    @RequestMapping("/")
    public Product getProduct(@RequestParam("id") long id)    {
        return new Product(id, "test");
    }

}
