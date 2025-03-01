package br.gabnsoares.dev.customerconnect.controller;

import br.gabnsoares.dev.customerconnect.controller.dto.CreateCustomerDto;
import br.gabnsoares.dev.customerconnect.service.CustomerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;

@RestController
@RequestMapping(path = "/customers")
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }


    @PostMapping
    public ResponseEntity<Void> createCustomer(@RequestBody CreateCustomerDto dto) {

        var customer = customerService.createCustomer(dto);

        return ResponseEntity.created(
                URI.create("/customers/" + customer.getCustomerId())
        ).build();
    }


}
