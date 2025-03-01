package br.gabnsoares.dev.customerconnect.service;

import br.gabnsoares.dev.customerconnect.controller.dto.CreateCustomerDto;
import br.gabnsoares.dev.customerconnect.entity.CustomerEntity;
import br.gabnsoares.dev.customerconnect.repository.CustomerRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public CustomerEntity createCustomer(CreateCustomerDto dto) {

        var entity = new CustomerEntity();
        entity.setFullName(dto.fullName());
        entity.setEmail(dto.email());
        entity.setCpf(dto.cpf());
        entity.setPhoneNumber(dto.phoneNumber());

        return customerRepository.save(entity);
    }
}
