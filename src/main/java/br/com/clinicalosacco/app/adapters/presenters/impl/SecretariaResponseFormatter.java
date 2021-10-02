package br.com.clinicalosacco.app.adapters.presenters.impl;

import br.com.clinicalosacco.app.adapters.controllers.response.EnderecoResponse;
import br.com.clinicalosacco.app.adapters.controllers.response.SecretariaResponse;
import br.com.clinicalosacco.app.adapters.database.entities.EnderecoData;
import br.com.clinicalosacco.app.adapters.database.entities.SecretariaData;
import br.com.clinicalosacco.app.adapters.presenters.SecretariaPresenter;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ResponseStatusException;
import java.util.List;

@Component
public class SecretariaResponseFormatter implements SecretariaPresenter {


    @Override
    public SecretariaResponse prepareSuccessView(SecretariaResponse response) {
        return response;
    }

    @Override
    public List<SecretariaResponse> prepareSuccessView(List<SecretariaResponse> responses) {
        return responses;
    }

    @Override
    public void prepareFailView(String error) {
        throw new ResponseStatusException(HttpStatus.CONFLICT, error);
    }

    //TODO converter de data pra response
    public static SecretariaResponse mapDataToResponse(SecretariaData secretariaData){
        SecretariaResponse response = SecretariaResponse.builder()
                .nome(secretariaData.getNome())
                .rg(secretariaData.getRg())
                .cpf(secretariaData.getCpf())
                .dataNascimento(secretariaData.getDataNascimento())
                .endereco(mapDataToResponse(secretariaData.getEndereco()))
                .build();
        return response;
    }

    private static EnderecoResponse mapDataToResponse(EnderecoData enderecoData){
        return EnderecoResponse.builder()
                    .rua(enderecoData.getRua())
                    .bairro(enderecoData.getBairro())
                    .cidade(enderecoData.getCidade())
                    .complemento(enderecoData.getComplemento())
                    .uf(enderecoData.getUf())
                    .build();
    }


}
