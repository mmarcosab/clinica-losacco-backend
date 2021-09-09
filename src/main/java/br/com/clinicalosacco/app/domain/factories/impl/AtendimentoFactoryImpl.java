package br.com.clinicalosacco.app.domain.factories.impl;

import br.com.clinicalosacco.app.domain.entities.Atendimento;
import br.com.clinicalosacco.app.domain.entities.Medico;
import br.com.clinicalosacco.app.domain.entities.Paciente;
import br.com.clinicalosacco.app.domain.entities.impl.CommonAtendimento;
import br.com.clinicalosacco.app.domain.factories.AtendimentoFactory;

import java.util.List;

public class AtendimentoFactoryImpl implements AtendimentoFactory {

    @Override
    public Atendimento create(String descricao, List<String> exames, Paciente paciente, Medico medico) throws Exception {
        return new CommonAtendimento(descricao, exames, paciente, medico);
    }
}
