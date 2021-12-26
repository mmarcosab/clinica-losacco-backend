package br.com.clinicalosacco.pacientes.adapters.controller.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.Date;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class PacienteRequestModel {

    @JsonProperty("nome")
    private String nome;

    @JsonProperty("cpf")
    private String cpf;

    @JsonProperty("data-nascimento")
    private Date dataNascimento;

    @JsonProperty("email")
    private String email;

    @JsonProperty("telefone")
    private String telefone;

    @JsonProperty("endereco")
    private EnderecoRequestModel endereco;

    @JsonProperty("plano-saude")
    private PlanoSaudeRequestModel planoSaude;

}
