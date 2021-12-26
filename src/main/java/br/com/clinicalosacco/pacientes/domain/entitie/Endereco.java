package br.com.clinicalosacco.pacientes.domain.entitie;


public class Endereco {

    private String rua;
    private int numero;
    private String complemento;
    private String cidade;
    private String UF;
    private String cep;
    private String pais;

    public Endereco(String rua, int numero, String complemento, String cidade, String UF, String cep, String pais) {
        validar(rua, numero, cidade, UF, cep, pais);
        this.rua = rua;
        this.numero = numero;
        this.complemento = complemento;
        this.cidade = cidade;
        this.UF = UF;
        this.cep = cep;
        this.pais = pais;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUF() {
        return UF;
    }

    public void setUF(String UF) {
        this.UF = UF;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    private void validar(String rua, int numero, String cidade, String UF, String cep, String pais) {
        if(rua == null || rua.isEmpty()) {
            throw new IllegalArgumentException("Rua esta invalida, favor verificar");
        }
        if(cidade == null || cidade.isEmpty()) {
            throw new IllegalArgumentException("Cidade esta invalida, favor verificar");
        }
        if(UF == null || UF.isEmpty()) {
            throw new IllegalArgumentException("UF esta invalido, favor verificar");
        }
        if(cep == null || cep.isEmpty() || cep.length() < 8) {
            throw new IllegalArgumentException("Cep da residencia esta invalido, favor verificar");
        }
        if(pais == null || pais.isEmpty()) {
            throw new IllegalArgumentException("Pais esta invalido, favor verificar");
        }
        if(numero == 0) {
            throw new IllegalArgumentException("Numero da residencia esta invalido, favor verificar");
        }

    }
}
