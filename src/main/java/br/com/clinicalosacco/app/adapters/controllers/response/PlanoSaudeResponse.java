package br.com.clinicalosacco.app.adapters.controllers.response;

import lombok.Builder;

@Builder
public class PlanoSaudeResponse {

    private String tipo;
    private String codigoIdentificacao;
    private String plano;
    private String cobertura;

}
