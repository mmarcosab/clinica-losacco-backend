package br.com.clinicalosacco.app.domain.factories;

import br.com.clinicalosacco.app.domain.entities.Atendimento;
import br.com.clinicalosacco.app.domain.entities.Medico;

import java.util.List;

public interface AtendimentoFactory {
    Atendimento create(String descricao, List<String> exames, Medico medico) throws Exception;
}
