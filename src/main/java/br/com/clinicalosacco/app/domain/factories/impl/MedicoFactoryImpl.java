package br.com.clinicalosacco.app.domain.factories.impl;

import br.com.clinicalosacco.app.domain.entities.Endereco;
import br.com.clinicalosacco.app.domain.entities.Medico;
import br.com.clinicalosacco.app.domain.entities.impl.CommonMedico;
import br.com.clinicalosacco.app.domain.factories.MedicoFactory;
import org.springframework.stereotype.Service;

@Service
public class MedicoFactoryImpl implements MedicoFactory {

    @Override
    public Medico create(String nome, String cpf, String rg, String crm, Endereco endereco) throws Exception {
        return new CommonMedico(nome, cpf, rg, crm, endereco);
    }
}
