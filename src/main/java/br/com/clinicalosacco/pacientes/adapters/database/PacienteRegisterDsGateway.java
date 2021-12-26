package br.com.clinicalosacco.pacientes.adapters.database;

import br.com.clinicalosacco.pacientes.adapters.controller.request.PacienteRequestModel;
import br.com.clinicalosacco.pacientes.adapters.database.mapper.PacienteDataMapper;
import java.util.List;


public interface PacienteRegisterDsGateway {
    boolean existsByName(String name);
    public boolean existsById(String id);
    PacienteDataMapper save(PacienteRequestModel requestModel);
    List<PacienteDataMapper> getAll();
    PacienteDataMapper update(PacienteRequestModel requestModel, String id);
    void delete(String id);
}
