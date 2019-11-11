package com.gontijopedro.autocenter.entity;

import javax.persistence.*;

@Entity
@Table (name = "cliente", schema ="public")
public class Cliente {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "id_cliente")
    private Long idCliente;

    @Column (name ="cpf")
    private String cpf;

    @Column (name = "nome")
    private String nome;

    @Column (name = "telefone")
    private String telefone;

    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
