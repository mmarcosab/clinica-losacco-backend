package br.com.clinicalosacco.app.domain.factories;

import br.com.clinicalosacco.app.domain.entities.PlanoSaude;


public interface PlanoSaudeFactory {
    PlanoSaude create(String tipo, String codigoIdentificacao, String plano, String cobertura) throws Exception;
}
