package br.com.clinicalosacco.pacientes.adapters.controller.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class PlanoSaudeRequestModel {

    @JsonProperty("numero_registro")
    private String numeroRegistro;

    @JsonProperty("tipo")
    private String tipo;

}
