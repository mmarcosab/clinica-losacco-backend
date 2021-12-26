package br.com.clinicalosacco.pacientes.adapters.presenter;

import br.com.clinicalosacco.pacientes.adapters.controller.response.PacienteResponseModel;
import br.com.clinicalosacco.pacientes.adapters.database.mapper.PacienteDataMapper;

import java.util.List;

public interface PacientePresenter {
    PacienteResponseModel prepareSuccessView(PacienteDataMapper pacienteDataMapper);
    List<PacienteResponseModel> prepareListSuccessView(List<PacienteDataMapper> pacientesData);
    PacienteResponseModel prepareFailView(String error);
}
