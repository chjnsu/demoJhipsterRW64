package com.vti.edu.railway.web.rest.vm;

import com.vti.edu.railway.domain.Customer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CustomerResource {
    private final CustomerResource customerResource;

    public CustomerResource(CustomerResource customerResource) {
        this.customerResource = customerResource;
    }
    @GetMapping("/Customer/getAll")
    public List<Customer> getAllCustomer(){return customerResource.findAll();}

    private List<Customer> findAll() {
        return null;
    };


}
