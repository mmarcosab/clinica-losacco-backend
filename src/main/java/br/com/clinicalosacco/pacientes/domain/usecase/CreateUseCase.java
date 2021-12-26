package br.com.clinicalosacco.pacientes.domain.usecase;

import br.com.clinicalosacco.pacientes.adapters.controller.request.PacienteRequestModel;
import br.com.clinicalosacco.pacientes.adapters.controller.response.PacienteResponseModel;

public interface CreateUseCase {
    PacienteResponseModel create(PacienteRequestModel pacienteRequestModel);
}
