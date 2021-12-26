package br.com.clinicalosacco.pacientes.domain.usecase.impl;

import br.com.clinicalosacco.pacientes.adapters.controller.request.PacienteRequestModel;
import br.com.clinicalosacco.pacientes.adapters.controller.response.EnderecoResponseModel;
import br.com.clinicalosacco.pacientes.adapters.controller.response.PacienteResponseModel;
import br.com.clinicalosacco.pacientes.adapters.controller.response.PlanoSaudeResponseModel;
import br.com.clinicalosacco.pacientes.adapters.database.PacienteRegisterDsGateway;
import br.com.clinicalosacco.pacientes.adapters.database.mapper.PacienteDataMapper;
import br.com.clinicalosacco.pacientes.adapters.presenter.PacientePresenter;
import br.com.clinicalosacco.pacientes.domain.usecase.DeleteUseCase;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;


@Slf4j
@Component
@RequiredArgsConstructor
public class DeletePacienteUseCaseImpl implements DeleteUseCase {

    private final PacienteRegisterDsGateway pacienteRegisterDsGateway;
    private final PacientePresenter pacientePresenter;

    @Override
    public void delete(String id) {
        pacienteRegisterDsGateway.delete(id);
    }

}
