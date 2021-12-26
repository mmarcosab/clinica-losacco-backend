package br.com.clinicalosacco.pacientes.domain.usecase.impl;

import br.com.clinicalosacco.pacientes.adapters.controller.response.PacienteResponseModel;
import br.com.clinicalosacco.pacientes.adapters.database.PacienteRegisterDsGateway;
import br.com.clinicalosacco.pacientes.adapters.presenter.PacientePresenter;
import br.com.clinicalosacco.pacientes.domain.usecase.FindUseCase;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import java.util.List;


@Slf4j
@Component
@RequiredArgsConstructor
public class FindPacienteUseCaseImpl implements FindUseCase {

    private final PacienteRegisterDsGateway pacienteRegisterDsGateway;
    private final PacientePresenter pacientePresenter;

    @Override
    public List<PacienteResponseModel> findAll() {
        return pacientePresenter.prepareListSuccessView(pacienteRegisterDsGateway.getAll());
    }

    @Override
    public PacienteResponseModel findById(String id) {
        return null;
    }

    @Override
    public PacienteResponseModel findByName(String name) {
        return null;
    }
}
