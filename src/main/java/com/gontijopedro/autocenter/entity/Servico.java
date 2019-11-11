package com.gontijopedro.autocenter.entity;

import javax.persistence.*;

@Entity
@Table (name = "servico", schema = "public")
public class Servico {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "id_servico")
    private Long idServico;

    @Column (name ="descricao")
    private String descricao;

    @Column (name = "valor")
    private Double valor;

    public Long getIdServiço() {
        return idServico;
    }

    public void setIdServiço(Long idServico) {
        this.idServico = idServico;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }





}
