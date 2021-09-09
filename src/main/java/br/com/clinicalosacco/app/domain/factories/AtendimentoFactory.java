package br.com.clinicalosacco.app.domain.factories;

import br.com.clinicalosacco.app.domain.entities.Atendimento;
import br.com.clinicalosacco.app.domain.entities.Medico;
import br.com.clinicalosacco.app.domain.entities.Paciente;

import java.util.List;

public interface AtendimentoFactory {
    Atendimento create(String descricao, List<String> exames, Paciente paciente, Medico medico) throws Exception;
}
