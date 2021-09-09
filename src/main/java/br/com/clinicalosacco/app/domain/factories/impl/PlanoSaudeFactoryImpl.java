package br.com.clinicalosacco.app.domain.factories.impl;

import br.com.clinicalosacco.app.domain.entities.PlanoSaude;
import br.com.clinicalosacco.app.domain.entities.impl.CommonPlanoSaude;
import br.com.clinicalosacco.app.domain.factories.PlanoSaudeFactory;

public class PlanoSaudeFactoryImpl implements PlanoSaudeFactory {

    @Override
    public PlanoSaude create(String tipo, String codigoIdentificacao, String plano, String cobertura) throws Exception {
        return new CommonPlanoSaude(tipo, codigoIdentificacao, plano, cobertura);
    }
}
