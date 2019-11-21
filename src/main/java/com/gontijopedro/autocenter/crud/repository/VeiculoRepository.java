package com.gontijopedro.autocenter.crud.repository;

import com.gontijopedro.autocenter.entity.Veiculo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface VeiculoRepository extends CrudRepository<Veiculo, Long> {
    Veiculo getByIdVeiculo (Long idVeiculo);
    Veiculo getVeiculoByPlaca (String placa);
}
