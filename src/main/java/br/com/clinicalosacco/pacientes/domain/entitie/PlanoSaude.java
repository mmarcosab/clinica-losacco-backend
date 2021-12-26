package br.com.clinicalosacco.pacientes.domain.entitie;

public class PlanoSaude {

    private String numeroRegistro;
    private String Tipo;

    public PlanoSaude(String numeroRegistro, String tipo) {
        validar(numeroRegistro, tipo);
        this.numeroRegistro = numeroRegistro;
        Tipo = tipo;
    }

    public String getNumeroRegistro() {
        return numeroRegistro;
    }

    public void setNumeroRegistro(String numeroRegistro) {
        this.numeroRegistro = numeroRegistro;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String tipo) {
        Tipo = tipo;
    }

    private void validar(String numeroOperacao, String tipo){
        if(numeroOperacao == null || numeroOperacao.isEmpty()) {
            throw new IllegalArgumentException("Numero Registro do plano de saude invalido, favor verificar");
        }
        if(tipo == null || tipo.isEmpty()) {
            throw new IllegalArgumentException("Tipo do plano de saude esta invalido, favor verificar");
        }
    }

}
