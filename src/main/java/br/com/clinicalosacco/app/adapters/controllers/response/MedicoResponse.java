package br.com.clinicalosacco.app.adapters.controllers.response;

import lombok.Builder;

@Builder
public class MedicoResponse {

    private String nome;
    private String cpf;
    private String rg;
    private String crm;
    private EnderecoResponse endereco;

}
