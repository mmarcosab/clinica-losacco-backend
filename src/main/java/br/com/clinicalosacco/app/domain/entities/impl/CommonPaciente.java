package br.com.clinicalosacco.app.domain.entities.impl;

import br.com.clinicalosacco.app.domain.entities.Atendimento;
import br.com.clinicalosacco.app.domain.entities.Endereco;
import br.com.clinicalosacco.app.domain.entities.Paciente;
import br.com.clinicalosacco.app.domain.entities.PlanoSaude;

import java.time.LocalDate;
import java.util.List;

public class CommonPaciente implements Paciente {

    private String nome;
    private String cpf;
    private String rg;
    private LocalDate dataNascimento;
    private Endereco endereco;
    private PlanoSaude planoSaude;
    private List<Atendimento> historico;

    public CommonPaciente(String nome, String cpf, String rg, LocalDate dataNascimento, Endereco endereco, PlanoSaude planoSaude, List<Atendimento> historico) throws Exception {
        validar(nome, cpf, rg, dataNascimento, endereco, planoSaude, historico);
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.dataNascimento = dataNascimento;
        this.endereco = endereco;
        this.planoSaude = planoSaude;
        this.historico = historico;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public String getRg() {
        return rg;
    }

    @Override
    public String getCpf() {
        return cpf;
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
    public PlanoSaude getPlanoSaude() {
        return planoSaude;
    }

    @Override
    public List<Atendimento> getHistorico() {
        return historico;
    }

    @Override
    public String toString() {
        return "CommonPaciente{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", rg='" + rg + '\'' +
                ", dataNascimento=" + dataNascimento +
                ", endereco=" + endereco +
                ", planoSaude=" + planoSaude +
                ", historico=" + historico +
                '}';
    }

    private void validar(String nome, String cpf, String rg, LocalDate dataNascimento, Endereco endereco, PlanoSaude planoSaude, List<Atendimento> historico) throws Exception {
        if(nome == null || nome.isEmpty()){
            throw new Exception("nome invalido, preencher corretamente");
        }
        if(cpf == null || cpf.isEmpty()){
            throw new Exception("cpf invalido, preencher corretamente");
        }
        if(rg == null || rg.isEmpty()){
            throw new Exception("rg invalido, preencher corretamente");
        }
        if(endereco == null){
            throw new Exception("endereco invalido, preencher corretamente");
        }
        if(planoSaude == null){
            throw new Exception("plano de saude invalido, preencher corretamente");
        }
    }

}
