package br.com.clinicalosacco.pacientes.domain.factories;

import br.com.clinicalosacco.pacientes.adapters.controller.request.PacienteRequestModel;
import br.com.clinicalosacco.pacientes.domain.entitie.Paciente;

public interface PacienteFactory {

    Paciente create(PacienteRequestModel pacienteRequestModel);

}
