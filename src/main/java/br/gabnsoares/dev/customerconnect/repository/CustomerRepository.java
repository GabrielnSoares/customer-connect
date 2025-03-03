package br.gabnsoares.dev.customerconnect.repository;

import org.springframework.data.domain.Page;
import br.gabnsoares.dev.customerconnect.entity.CustomerEntity;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<CustomerEntity, Long> {

    Page<CustomerEntity> findByCpf(String cpf, PageRequest pageRequest);

    Page<CustomerEntity> findByEmail(String email, PageRequest pageRequest);

    Page<CustomerEntity> findByCpfAndEmail(String cpf, String email, PageRequest pageRequest);
}
