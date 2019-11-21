package com.gontijopedro.autocenter.crud;


import com.gontijopedro.autocenter.crud.repository.ClienteRepository;
import com.gontijopedro.autocenter.entity.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Component
public class ClienteCrud {
    @Autowired
    private ClienteRepository clienteRepository;
    @PersistenceContext
    private EntityManager entityManager;

       //Instanciar Cliente
    public Cliente insereCliente(String cpf, String nome, String telefone){
        Cliente cliente = clienteRepository.getClienteByCpf(cpf);
        if (cliente == null){
            cliente = new Cliente();
            cliente.setCpf(cpf);
            cliente.setNome(nome);
            cliente.setTelefone(telefone);
            //Persistir cliente no banco
            return clienteRepository.save(cliente);

        } else {
            return cliente;
        }
    }

    public List <Cliente> getListaClienteRecente(){
        List<Cliente> listaCliente = entityManager.createQuery("SELECT c FROM Cliente c ORDER BY c.idCliente DESC").setMaxResults(10).getResultList();
        return listaCliente;
    }
}
