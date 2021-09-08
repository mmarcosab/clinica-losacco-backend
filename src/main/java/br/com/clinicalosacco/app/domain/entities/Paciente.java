package br.com.clinicalosacco.app.domain.entities;

import java.time.LocalDate;
import java.util.List;

public interface Paciente {
    String getNome();
    String getRg();
    String getCpf();
    LocalDate getDataNascimento();
    Endereco getEndereco();
    PlanoSaude getPlanoSaude();
    List<Atendimento> getHistorico();
}
