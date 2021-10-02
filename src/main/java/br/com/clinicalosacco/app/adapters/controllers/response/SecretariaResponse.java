package br.com.clinicalosacco.app.adapters.controllers.response;

import lombok.Builder;

import java.time.LocalDate;

@Builder
public class SecretariaResponse {

    private String nome;
    private String cpf;
    private String rg;
    private LocalDate dataNascimento;
    private EnderecoResponse endereco;

}
