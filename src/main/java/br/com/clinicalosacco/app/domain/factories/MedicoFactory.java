package br.com.clinicalosacco.app.domain.factories;

import br.com.clinicalosacco.app.domain.entities.Endereco;
import br.com.clinicalosacco.app.domain.entities.Medico;

public interface MedicoFactory {
    Medico create(String nome, String cpf, String rg, String crm, Endereco endereco) throws Exception;
}
