package br.com.clinicalosacco.pacientes.adapters.controller.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class PlanoSaudeResponseModel {

    @JsonProperty("id")
    private String id;

    @JsonProperty("numero_registro")
    private String numeroRegistro;

    @JsonProperty("tipo")
    private String tipo;

}
