package io.bymbl.api.shop.clients;

import io.bymbl.api.shop.model.Customer;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Author: lars
 * Since: 15-12-15.
 */
@FeignClient("customer-service")
public interface CustomerClient {

    @RequestMapping(method = RequestMethod.GET, value = "/")
    Customer getCustomer(@RequestParam("id") long id);

}
