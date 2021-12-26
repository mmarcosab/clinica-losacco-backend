package br.com.clinicalosacco.pacientes.adapters.controller.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class EnderecoRequestModel {

    @JsonProperty("rua")
    private String rua;

    @JsonProperty("numero")
    private int numero;

    @JsonProperty("complemento")
    private String complemento;

    @JsonProperty("cidade")
    private String cidade;

    @JsonProperty("UF")
    private String UF;

    @JsonProperty("cep")
    private String cep;

    @JsonProperty("pais")
    private String pais;

}
