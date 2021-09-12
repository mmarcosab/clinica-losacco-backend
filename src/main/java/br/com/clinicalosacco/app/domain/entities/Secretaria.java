package br.com.clinicalosacco.app.domain.entities;

import java.time.LocalDate;

public interface Secretaria {

    String getNome();
    String getCpf();
    String getRg();
    LocalDate getDataNascimento();
    Endereco getEndereco();

}
