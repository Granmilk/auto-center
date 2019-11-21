package com.gontijopedro.autocenter.crud;

import com.gontijopedro.autocenter.crud.repository.ServicoRepository;
import com.gontijopedro.autocenter.entity.Servico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ServicoCrud {
    @Autowired
    private ServicoRepository servicoRepository;
    //Instanciar Serviço
    public Servico insereServico(Long idServico, String descricao, Double valor){
        Servico servico = servicoRepository.getByIdServico(idServico);
        if (servico == null){
            servico = new Servico();
            servico.setIdServiço(idServico);
            servico.setDescricao(descricao);
            servico.setValor(valor);
            //Persistir serviço no banco
            return servicoRepository.save(servico);

        } else {
            return servico;
        }
    }
}


