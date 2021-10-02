package br.com.clinicalosacco.app.adapters.controllers.response;


import lombok.Builder;

import java.time.LocalDate;
import java.util.List;

@Builder
public class PacienteResponse {

    private String nome;
    private String cpf;
    private String rg;
    private LocalDate dataNascimento;
    private EnderecoResponse endereco;
    private PlanoSaudeResponse planoSaude;
    private List<AtendimentoResponse> historico;


}
