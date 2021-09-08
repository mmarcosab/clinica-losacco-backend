package br.com.clinicalosacco.app.domain.entities.impl;

import br.com.clinicalosacco.app.domain.entities.Atendimento;
import br.com.clinicalosacco.app.domain.entities.Medico;
import br.com.clinicalosacco.app.domain.entities.Paciente;

import java.util.List;

public class CommonAtendimento implements Atendimento {

    private String descricao;
    private List<String> exames;
    private Paciente paciente;
    private Medico medico;

    public CommonAtendimento(String descricao, List<String> exames, Paciente paciente, Medico medico) {
        this.descricao = descricao;
        this.exames = exames;
        this.paciente = paciente;
        this.medico = medico;
    }

    @Override
    public String getDescricao() {
        return descricao;
    }

    @Override
    public List<String> exames() {
        return exames;
    }

    @Override
    public Paciente getPaciente() {
        return paciente;
    }

    @Override
    public Medico getMedico() {
        return medico;
    }

    @Override
    public String toString() {
        return "CommonAtendimento{" +
                "descricao='" + descricao + '\'' +
                ", exames=" + exames +
                ", paciente=" + paciente +
                ", medico=" + medico +
                '}';
    }

}
