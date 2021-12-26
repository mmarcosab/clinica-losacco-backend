package br.com.clinicalosacco.pacientes.domain.entitie;

import java.util.Date;

public class PacienteImpl implements Paciente {

    private String nome;
    private String cpf;
    private Date dataNascimento;
    private String email;
    private String telefone;
    private Endereco endereco;
    private PlanoSaude planoSaude;

    public PacienteImpl(String nome, String cpf, Date dataNascimento, String email, String telefone, Endereco endereco, PlanoSaude planoSaude) {
        validar(nome, cpf, dataNascimento, email, telefone);
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.email = email;
        this.telefone = telefone;
        this.endereco = endereco;
        this.planoSaude = planoSaude;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public PlanoSaude getPlanoSaude() {
        return planoSaude;
    }

    public void setPlanoSaude(PlanoSaude planoSaude) {
        this.planoSaude = planoSaude;
    }

    private void validar(String nome, String cpf, Date dataNascimento, String email, String telefone){
        if(nome == null || nome.isEmpty()){
            throw new IllegalArgumentException("Nome esta nulo ou vazio, favor verificar");
        }
        if(cpf == null || cpf.isEmpty() || cpf.length() < 11){
            throw new IllegalArgumentException("Cpf esta invalido, favor verificar");
        }
        if(email == null || email.isEmpty()){
            throw new IllegalArgumentException("Email esta invalido, favor verificar");
        }
        if(telefone == null || telefone.isEmpty() || telefone.length() < 11){
            throw new IllegalArgumentException("Telefone esta invalido, favor verificar");
        }
    }
}
