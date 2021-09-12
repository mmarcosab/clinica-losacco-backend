package br.com.clinicalosacco.app.domain.entities.impl;

import br.com.clinicalosacco.app.domain.entities.Endereco;

public class CommonEndereco implements Endereco {

    private String rua;
    private String numero;
    private String cidade;
    private String complemento;
    private String bairro;
    private String uf;

    public CommonEndereco(String rua, String numero, String cidade, String complemento, String bairro, String uf) throws Exception {
        validar(rua, numero, cidade, bairro, uf);
        this.rua = rua;
        this.numero = numero;
        this.cidade = cidade;
        this.complemento = complemento;
        this.bairro = bairro;
        this.uf = uf;
    }

    @Override
    public String getRua() {
        return this.rua;
    }

    @Override
    public String getNumero() {
        return this.numero;
    }

    @Override
    public String getBairro() {
        return this.bairro;
    }

    @Override
    public String getCidade() {
        return this.cidade;
    }

    @Override
    public String getComplemento() {
        return this.complemento;
    }

    @Override
    public String getUf() {
        return null;
    }

    @Override
    public String toString() {
        return "CommonEndereco{" +
                "rua='" + rua + '\'' +
                ", numero='" + numero + '\'' +
                ", cidade='" + cidade + '\'' +
                ", complemento='" + complemento + '\'' +
                ", bairro='" + bairro + '\'' +
                ", UF='" + uf + '\'' +
                '}';
    }

    private void validar(String rua, String numero, String cidade, String bairro, String uf) throws Exception {
        if(rua == null || rua.isEmpty()){
            throw new Exception("rua invalida, preencher corretamente");
        }
        if(numero == null || numero.isEmpty()){
            throw new Exception("numero invalido, preencher corretamente");
        }
        if(cidade == null || cidade.isEmpty()){
            throw new Exception("cidade invalida, preencher corretamente");
        }
        if(bairro == null || bairro.isEmpty()){
            throw new Exception("bairro invalido, preencher corretamente");
        }
        if(uf == null || uf.isEmpty()){
            throw new Exception("uf invalido, preencher corretamente");
        }
    }

}
