package br.com.clinicalosacco.app.adapters.presenters.impl;

import br.com.clinicalosacco.app.adapters.controllers.response.PacienteResponse;
import br.com.clinicalosacco.app.adapters.database.entities.PacienteData;
import br.com.clinicalosacco.app.adapters.presenters.PacientePresenter;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ResponseStatusException;
import java.util.List;

@Component
public class PacienteResponseFormatter implements PacientePresenter {

    @Override
    public PacienteResponse prepareSuccessView(PacienteResponse response) {
        return response;
    }

    @Override
    public List<PacienteResponse> prepareSuccessView(List<PacienteResponse> response) {
        return response;
    }

    @Override
    public void prepareFailView(String error) {
        throw new ResponseStatusException(HttpStatus.CONFLICT, error);
    }

    //TODO converter de data pra response
    public static PacienteResponse mapDataToResponse(PacienteData pacienteData){
        PacienteResponse response = new PacienteResponse();
        return response;
    }
}
