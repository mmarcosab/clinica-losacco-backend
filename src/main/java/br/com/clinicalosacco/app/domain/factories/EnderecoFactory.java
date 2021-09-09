package br.com.clinicalosacco.app.domain.factories;

import br.com.clinicalosacco.app.domain.entities.Endereco;

public interface EnderecoFactory {
    Endereco create(String rua, String numero, String cidade, String complemento, String bairro, String UF) throws Exception;
}
