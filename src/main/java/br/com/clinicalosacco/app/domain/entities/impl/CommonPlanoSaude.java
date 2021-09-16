package br.com.clinicalosacco.app.domain.entities.impl;

import br.com.clinicalosacco.app.domain.entities.PlanoSaude;

public class CommonPlanoSaude implements PlanoSaude {

    private String tipo;
    private String codigoIdentificacao;
    private String plano;
    private String cobertura;

    public CommonPlanoSaude(String tipo, String codigoIdentificacao, String plano, String cobertura) throws Exception {
        validar(tipo, codigoIdentificacao, plano, cobertura);
        this.tipo = tipo;
        this.codigoIdentificacao = codigoIdentificacao;
        this.plano = plano;
        this.cobertura = cobertura;
    }

    @Override
    public String getTipo() {
        return this.tipo;
    }

    @Override
    public String getCodigoIdentificacao() {
        return this.codigoIdentificacao;
    }

    @Override
    public String getPlano() {
        return this.plano;
    }

    @Override
    public String getCobertura() {
        return this.cobertura;
    }

    @Override
    public String toString() {
        return "CommonPlanoSaude{" +
                "tipo='" + tipo + '\'' +
                ", codigoIdentificacao='" + codigoIdentificacao + '\'' +
                ", plano='" + plano + '\'' +
                ", cobertura='" + cobertura + '\'' +
                '}';
    }

    private void validar(String tipo, String codigoIdentificacao, String plano, String cobertura) throws Exception {
        if(tipo == null || tipo.isEmpty()){
            throw new Exception("tipo invalido, preencher corretamente");
        }
        if(codigoIdentificacao == null || codigoIdentificacao.isEmpty()){
            throw new Exception("codigo identificacao invalido, preencher corretamente");
        }
        if(plano == null || plano.isEmpty()){
            throw new Exception("plano invalido, preencher corretamente");
        }
        if(cobertura == null || cobertura.isEmpty()){
            throw new Exception("cobertura invalida, preencher corretamente");
        }
    }

}
