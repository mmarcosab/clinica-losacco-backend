package br.com.clinicalosacco.app.adapters.presenters;

import br.com.clinicalosacco.app.adapters.controllers.response.PacienteResponse;
import java.util.List;

public interface PacientePresenter {
    PacienteResponse prepareSuccessView(PacienteResponse response);
    List<PacienteResponse> prepareSuccessView(List<PacienteResponse> response);
    void prepareFailView(String error);
}
