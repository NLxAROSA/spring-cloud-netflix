package io.bymbl.service.customer;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author: lars
 * Since: 14-12-15.
 */
@RestController
public class CustomerService {

    @RequestMapping("/")
    public Customer getCustomer(@RequestParam("id") long id) {
        return new Customer(id, "This is a really cool product!");
    }

}
