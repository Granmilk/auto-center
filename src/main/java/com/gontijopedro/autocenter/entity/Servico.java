package com.gontijopedro.autocenter.entity;

import javax.persistence.*;

@Entity
@Table (name = "servico", schema = "public")
public class Servico {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "id_servico")
    private Long idServiço;

    @Column (name ="descricao")
    private String descricao;

    @Column (name = "valor")
    private Double valor;

    public Long getIdServiço() {
        return idServiço;
    }

    public void setIdServiço(Long idServiço) {
        this.idServiço = idServiço;
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
