package br.com.clinicalosacco.app.adapters.presenters;

import br.com.clinicalosacco.app.adapters.controllers.response.SecretariaResponse;
import java.util.List;

public interface SecretariaPresenter {
    SecretariaResponse prepareSuccessView(SecretariaResponse medicoResponse);
    List<SecretariaResponse> prepareSuccessView(List<SecretariaResponse> medicoResponse);
    void prepareFailView(String error);
}
