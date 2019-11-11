package com.gontijopedro.autocenter.entity;

import javax.persistence.*;

@Entity
@Table (name = "veiculo", schema = "public")
public class Veiculo {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "id_veiculo")
    private Long idVeiculo;

    @Column (name = "marca")
    private String marca;

    @Column (name = "modelo")
    private String modelo;

    @Column (name = "cor")
    private String cor;

    @Column (name = "placa")
    private String placa;

    public Long getIdVeiculo() {
        return idVeiculo;
    }

    public void setIdVeiculo(Long idVeiculo) {
        this.idVeiculo = idVeiculo;
    }


    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
}
