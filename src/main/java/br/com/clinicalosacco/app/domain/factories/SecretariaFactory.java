package br.com.clinicalosacco.app.domain.factories;

import br.com.clinicalosacco.app.domain.entities.Endereco;
import br.com.clinicalosacco.app.domain.entities.Secretaria;

import java.time.LocalDate;


public interface SecretariaFactory {
    Secretaria create(String nome, String cpf, String rg, LocalDate dataNascimento, Endereco endereco) throws Exception;
}
