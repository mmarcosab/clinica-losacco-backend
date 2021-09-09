package br.com.clinicalosacco.app.domain.entities.impl;

import br.com.clinicalosacco.app.domain.entities.Endereco;
import br.com.clinicalosacco.app.domain.entities.Medico;

public class CommonMedico implements Medico {

    private String nome;
    private String cpf;
    private String rg;
    private String crm;
    private Endereco endereco;

    public CommonMedico(String nome, String cpf, String rg, String crm, Endereco endereco) throws Exception {
        validar(nome, cpf, rg, crm, endereco);
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.crm = crm;
        this.endereco = endereco;
    }

    @Override
    public String getNome() {
        return this.nome;
    }

    @Override
    public String getCpf() {
        return this.cpf;
    }

    @Override
    public String getRg() {
        return this.rg;
    }

    @Override
    public String getCrm() {
        return this.crm;
    }

    @Override
    public Endereco getEndereco() {
        return this.endereco;
    }

    @Override
    public String toString() {
        return "CommonMedico{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", rg='" + rg + '\'' +
                ", crm='" + crm + '\'' +
                ", endereco='" + endereco + '\'' +
                '}';
    }

    private void validar(String nome, String cpf, String rg, String crm, Endereco endereco) throws Exception {
        if(nome == null || nome.isEmpty()){
            throw new Exception("nome invalida, preencher corretamente");
        }
        if(cpf == null || cpf.isEmpty()){
            throw new Exception("cpf invalido, preencher corretamente");
        }
        if(rg == null || rg.isEmpty()){
            throw new Exception("rg invalido, preencher corretamente");
        }
        if(crm == null || crm.isEmpty()){
            throw new Exception("complemento invalido, preencher corretamente");
        }
        if(endereco == null){
            throw new Exception("endereco invalido, preencher corretamente");
        }
    }

}
