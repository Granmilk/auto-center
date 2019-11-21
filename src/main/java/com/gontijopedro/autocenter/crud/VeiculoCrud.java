package com.gontijopedro.autocenter.crud;

import com.gontijopedro.autocenter.crud.repository.VeiculoRepository;
import com.gontijopedro.autocenter.entity.Veiculo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Component
public class VeiculoCrud {
    @Autowired
    private VeiculoRepository veiculoRepository;
    @PersistenceContext
    private EntityManager entityManager;

    //Instanciar Veiculo
    public Veiculo insereVeiculo(String marca, String modelo, String cor, String placa){
        Veiculo veiculo = veiculoRepository.getVeiculoByPlaca(placa);
        if (veiculo == null){
            veiculo = new Veiculo();
            veiculo.setMarca(marca);
            veiculo.setModelo(modelo);
            veiculo.setCor(cor);
            veiculo.setPlaca(placa);
            //Persistir veiculo no banco
            return veiculoRepository.save(veiculo);

        } else {
            return veiculo;
        }
    }

    public List<Veiculo> getListaVeiculoRecente(){
        List<Veiculo> listaVeiculo = entityManager.createQuery("SELECT v FROM Veiculo v ORDER BY v.idVeiculo DESC").setMaxResults(10).getResultList();
        return listaVeiculo;
    }
}
