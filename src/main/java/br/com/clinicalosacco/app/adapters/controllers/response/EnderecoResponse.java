package br.com.clinicalosacco.app.adapters.controllers.response;

import lombok.Builder;

@Builder
public class EnderecoResponse {

    private String rua;
    private String numero;
    private String cidade;
    private String complemento;
    private String bairro;
    private String uf;

}
