package br.com.clinicalosacco.pacientes.domain.usecase;

import br.com.clinicalosacco.pacientes.adapters.controller.response.PacienteResponseModel;
import java.util.List;

public interface FindUseCase {
    List<PacienteResponseModel> findAll();
    PacienteResponseModel findById(String id);
    PacienteResponseModel findByName(String name);
}
