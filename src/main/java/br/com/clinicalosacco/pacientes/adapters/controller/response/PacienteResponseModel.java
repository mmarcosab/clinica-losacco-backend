package br.com.clinicalosacco.pacientes.adapters.controller.response;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

import java.util.Date;

@Getter
@Builder
@ToString
public class PacienteResponseModel {

    @JsonProperty("id")
    private String id;

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
    private EnderecoResponseModel endereco;

    @JsonProperty("plano-saude")
    private PlanoSaudeResponseModel planoSaude;

}
