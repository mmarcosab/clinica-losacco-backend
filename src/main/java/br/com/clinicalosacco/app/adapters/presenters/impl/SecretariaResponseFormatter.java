package br.com.clinicalosacco.app.adapters.presenters.impl;

import br.com.clinicalosacco.app.adapters.controllers.response.SecretariaResponse;
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
        return null;
    }

    @Override
    public List<SecretariaResponse> prepareSuccessView(List<SecretariaResponse> response) {
        return null;
    }

    @Override
    public void prepareFailView(String error) {
        throw new ResponseStatusException(HttpStatus.CONFLICT, error);
    }

    //TODO converter de data pra response
    public static SecretariaResponse mapDataToResponse(SecretariaData secretariaData){
        SecretariaResponse response = new SecretariaResponse();
        return response;
    }
}
