package br.com.clinicalosacco.app.domain.factories.impl;

import br.com.clinicalosacco.app.domain.entities.Atendimento;
import br.com.clinicalosacco.app.domain.entities.Medico;
import br.com.clinicalosacco.app.domain.entities.impl.CommonAtendimento;
import br.com.clinicalosacco.app.domain.factories.AtendimentoFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AtendimentoFactoryImpl implements AtendimentoFactory {

    @Override
    public Atendimento create(String descricao, List<String> exames, Medico medico) throws Exception {
        return new CommonAtendimento(descricao, exames, medico);
    }
}
