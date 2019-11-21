package com.gontijopedro.autocenter.crud.repository;

import com.gontijopedro.autocenter.entity.Cliente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface ClienteRepository extends CrudRepository<Cliente, Long> {
    Cliente getByIdCliente(Long idCliente);
    Cliente getClienteByCpf(String cpf);
}
