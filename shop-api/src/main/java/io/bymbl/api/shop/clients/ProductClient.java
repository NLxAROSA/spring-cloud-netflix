package io.bymbl.api.shop.clients;

import io.bymbl.api.shop.model.Product;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Author: lars
 * Since: 15-12-15.
 */
@FeignClient("product-service")
public interface ProductClient {

    @RequestMapping(method = RequestMethod.GET, value = "/")
    Product getProduct(@RequestParam("id") long id);

}
