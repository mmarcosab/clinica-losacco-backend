package br.com.clinicalosacco.app.domain.entities;

import java.util.List;

public interface Atendimento {
    String getDescricao();
    List<String> exames();
    Paciente getPaciente();
    Medico getMedico();
}
