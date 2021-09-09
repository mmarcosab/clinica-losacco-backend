package br.com.clinicalosacco.app.domain.entities;

public interface Medico {
    String getNome();
    String getCpf();
    String getRg();
    String getCrm();
    Endereco getEndereco();
}
