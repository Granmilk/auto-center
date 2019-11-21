package com.gontijopedro.autocenter.controller;

import com.gontijopedro.autocenter.crud.ClienteCrud;
import com.gontijopedro.autocenter.crud.VeiculoCrud;
import com.gontijopedro.autocenter.entity.Cliente;
import com.gontijopedro.autocenter.entity.Veiculo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.xml.soap.SAAJResult;
import java.util.List;

@Controller
public class IndexController {
    @Autowired
    private ClienteCrud clienteCrud;
    @Autowired
    private VeiculoCrud veiculoCrud;
    @RequestMapping("/")
    public String index(Model model) {

        List<Veiculo> listaVeiculos = veiculoCrud.getListaVeiculoRecente();
        model.addAttribute("listaVeiculos", listaVeiculos);
        return "index.html";
    }

    @RequestMapping("/cliente")
    public String cliente(Model model){

        List<Cliente> listaClientes = clienteCrud.getListaClienteRecente();
        model.addAttribute("listaClientes", listaClientes);
        return "cliente.html";
    }
}


