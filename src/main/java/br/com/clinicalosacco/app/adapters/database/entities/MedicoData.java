package br.com.clinicalosacco.app.adapters.database.entities;

import lombok.Builder;
import lombok.Getter;
import javax.persistence.*;

@Getter
@Builder
@Entity
@Table(name = "medico")
public class MedicoData {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "cpf")
    private String cpf;

    @Column(name = "rg")
    private String rg;

    @Column(name = "crm")
    private String crm;

    @OneToOne
    @Embedded
    private EnderecoData endereco;

}
