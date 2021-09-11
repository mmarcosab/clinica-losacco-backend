package br.com.clinicalosacco.app.adapters.database.entities;

import br.com.clinicalosacco.app.domain.entities.Atendimento;
import br.com.clinicalosacco.app.domain.entities.Endereco;
import br.com.clinicalosacco.app.domain.entities.PlanoSaude;
import lombok.Builder;
import lombok.Getter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Getter
@Builder
@Entity
@Table(name = "paciente")
public class PacienteData {

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

    @OneToOne
    @Embedded
    private PlanoSaudeData planoSaude;

}
