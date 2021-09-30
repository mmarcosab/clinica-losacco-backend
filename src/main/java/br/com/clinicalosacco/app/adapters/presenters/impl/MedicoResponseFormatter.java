package br.com.clinicalosacco.app.adapters.presenters.impl;

import br.com.clinicalosacco.app.adapters.controllers.response.MedicoResponse;
import br.com.clinicalosacco.app.adapters.database.entities.MedicoData;
import br.com.clinicalosacco.app.adapters.presenters.MedicoPresenter;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ResponseStatusException;
import java.util.List;

@Component
public class MedicoResponseFormatter implements MedicoPresenter {

    @Override
    public MedicoResponse prepareSuccessView(MedicoResponse medicoResponse) {
        return medicoResponse;
    }

    @Override
    public List<MedicoResponse> prepareSuccessView(List<MedicoResponse> medicos) {
        return medicos;
    }

    @Override
    public void prepareFailView(String error) {
        throw new ResponseStatusException(HttpStatus.CONFLICT, error);
    }

    //TODO converter de data pra response
    @Override
    public MedicoResponse mapDataToResponse(MedicoData medicoData){
        MedicoResponse response = new MedicoResponse();
        return response;
    }
}
