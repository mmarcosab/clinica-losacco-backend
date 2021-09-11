package br.com.clinicalosacco.app.adapters.database.entities;

import lombok.Builder;
import lombok.Getter;
import javax.persistence.*;
import java.util.List;

@Getter
@Builder
@Entity
@Table(name = "atendimento")
public class AtendimentoData {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "descricao")
    private String descricao;

    @OneToMany
    @Column(name = "exames")
    private List<ExameData> exames;

    @OneToOne
    private PacienteData paciente;

    @OneToOne
    private MedicoData medico;

}
