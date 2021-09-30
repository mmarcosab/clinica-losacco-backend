package br.com.clinicalosacco.app.adapters.database.entities;

import lombok.Builder;
import lombok.Getter;
import javax.persistence.*;
import java.time.LocalDate;

@Getter
@Builder
@Entity
@Table(name = "paciente")
public class SecretariaData {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "numero_cpf")
    private String cpf;

    @Column(name = "numero_rg")
    private String rg;

    @Column(name = "data_nascimento")
    private LocalDate dataNascimento;

    @OneToOne
    @Embedded
    private EnderecoData endereco;

}
