package br.com.clinicalosacco.app.adapters.database.entities;

import lombok.Builder;
import lombok.Getter;

import javax.persistence.*;

@Getter
@Builder
@Embeddable
@Entity
@Table(name = "endereco")
public class EnderecoData {

    @EmbeddedId
    private Integer id;

    @Column(name = "rua")
    private String rua;

    @Column(name = "numero")
    private String numero;

    @Column(name = "cidade")
    private String cidade;

    @Column(name = "complemento")
    private String complemento;

    @Column(name = "bairro")
    private String bairro;

    @Column(name = "uf")
    private String uf;

}
