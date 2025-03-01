package br.gabnsoares.dev.customerconnect.repository;

import br.gabnsoares.dev.customerconnect.entity.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<CustomerEntity, Long> {

}
