package br.com.clinicalosacco.app.adapters.presenters;

import br.com.clinicalosacco.app.adapters.controllers.response.MedicoResponse;
import br.com.clinicalosacco.app.adapters.database.entities.MedicoData;

import java.util.List;

public interface MedicoPresenter {
    MedicoResponse prepareSuccessView(MedicoResponse medicoResponse);
    List<MedicoResponse> prepareSuccessView(List<MedicoResponse> medicoResponse);
    void prepareFailView(String error);
    MedicoResponse mapDataToResponse(MedicoData medicoData);
}
