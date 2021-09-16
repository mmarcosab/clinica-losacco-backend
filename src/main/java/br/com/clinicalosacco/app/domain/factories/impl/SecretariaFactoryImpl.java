package br.com.clinicalosacco.app.domain.factories.impl;

import br.com.clinicalosacco.app.domain.entities.Endereco;
import br.com.clinicalosacco.app.domain.entities.Secretaria;
import br.com.clinicalosacco.app.domain.entities.impl.CommonSecretaria;
import br.com.clinicalosacco.app.domain.factories.SecretariaFactory;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class SecretariaFactoryImpl implements SecretariaFactory {

    @Override
    public Secretaria create(String nome, String cpf, String rg, LocalDate dataNascimento, Endereco endereco) throws Exception {
        return new CommonSecretaria(nome, cpf, rg, dataNascimento, endereco);
    }
}
