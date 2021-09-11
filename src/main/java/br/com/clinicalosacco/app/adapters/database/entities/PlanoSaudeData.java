package br.com.clinicalosacco.app.adapters.database.entities;

import lombok.Builder;
import lombok.Getter;

import javax.persistence.*;

@Getter
@Builder
@Embeddable
@Entity
@Table(name = "plano_saude")
public class PlanoSaudeData {

    @EmbeddedId
    private Integer id;

    @Column(name = "tipo")
    private String tipo;

    @Column(name = "codigo_identificacao")
    private String codigoIdentificacao;

    @Column(name = "plano")
    private String plano;

    @Column(name = "cobertura")
    private String cobertura;

}
