package com.gontijopedro.autocenter.entity;

import javax.persistence.*;

@Entity
@Table (name = "servico_veiculo", schema = "public")
public class ServicoVeiculo {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column (name = "id_servico_veiculo")
    private Long idServicoVeiculo;

    @Column (name = "id_servico")
    private Long idServico;

    @ManyToOne (fetch = FetchType.LAZY)
    @JoinColumn (name ="id_servico", insertable = false, updatable = false, foreignKey = @ForeignKey(name = "fk_servico_veiculo_id_servico"))
    private Servico servico;

    @Column (name = "id_veiculo")
    private Long getIdVeiculo;

    @ManyToOne (fetch = FetchType.LAZY)
    @JoinColumn (name ="id_veiculo", insertable = false, updatable = false, foreignKey = @ForeignKey(name = "fk_servico_veiculo_id_veiculo"))
    private Veiculo veiculo;

    public Long getIdServicoVeiculo() {
        return idServicoVeiculo;
    }

    public void setIdServicoVeiculo(Long idServicoVeiculo) {
        this.idServicoVeiculo = idServicoVeiculo;
    }

    public Long getIdServico() {
        return idServico;
    }

    public void setIdServico(Long idServico) {
        this.idServico = idServico;
    }

    public Servico getServico() {
        return servico;
    }

    public void setServico(Servico servico) {
        this.servico = servico;
    }

    public Long getGetIdVeiculo() {
        return getIdVeiculo;
    }

    public void setGetIdVeiculo(Long getIdVeiculo) {
        this.getIdVeiculo = getIdVeiculo;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }
}
