package br.com.clinicalosacco.pacientes.adapters.controller.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class EnderecoResponseModel {

    @JsonProperty("id")
    private String id;

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
