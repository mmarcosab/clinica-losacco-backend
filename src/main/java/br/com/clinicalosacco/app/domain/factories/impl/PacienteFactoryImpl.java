package br.com.clinicalosacco.app.domain.factories.impl;

import br.com.clinicalosacco.app.domain.entities.Endereco;
import br.com.clinicalosacco.app.domain.entities.impl.CommonEndereco;
import br.com.clinicalosacco.app.domain.factories.EnderecoFactory;

public class PacienteFactoryImpl implements EnderecoFactory {

    @Override
    public Endereco create(String rua, String numero, String cidade, String complemento, String bairro, String UF) throws Exception {
        return new CommonEndereco(rua, numero, cidade, complemento, bairro, UF);
    }
}
