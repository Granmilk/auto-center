package com.gontijopedro.autocenter.crud.repository;

import com.gontijopedro.autocenter.entity.Servico;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;


@Component
public interface ServicoRepository extends CrudRepository<Servico, Long> {
    Servico getByIdServico (Long idServico);
    Servico getServicoByDescricao (String descricao);
}
