package br.com.clinicalosacco.app.domain.entities.impl;

import br.com.clinicalosacco.app.domain.entities.Endereco;
import br.com.clinicalosacco.app.domain.entities.Secretaria;

import java.time.LocalDate;

public class CommonSecretaria implements Secretaria {

    private String nome;
    private String cpf;
    private String rg;
    private LocalDate dataNascimento;
    private Endereco endereco;

    public CommonSecretaria(String nome, String cpf, String rg, LocalDate dataNascimento, Endereco endereco) throws Exception {
        validar(nome, cpf, rg, dataNascimento, endereco);
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public String getCpf() {
        return cpf;
    }

    @Override
    public String getRg() {
        return rg;
    }

    @Override
    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    @Override
    public Endereco getEndereco() {
        return endereco;
    }

    @Override
    public String toString() {
        return "CommonSecretaria{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", rg='" + rg + '\'' +
                ", dataNascimento=" + dataNascimento +
                ", endereco=" + endereco +
                '}';
    }

    private void validar(String nome, String cpf, String rg, LocalDate dataNascimento, Endereco endereco) throws Exception {
        if(nome == null || nome.isEmpty()){
            throw new Exception("nome invalido, preencher corretamente");
        }
        if(cpf == null || cpf.isEmpty()){
            throw new Exception("cpf invalido, preencher corretamente");
        }
        if(dataNascimento == null){
            throw new Exception("data de nascimento invalida, preencher corretamente");
        }
        if(endereco == null){
            throw new Exception("endereco invalido, preencher corretamente");
        }
    }

}
