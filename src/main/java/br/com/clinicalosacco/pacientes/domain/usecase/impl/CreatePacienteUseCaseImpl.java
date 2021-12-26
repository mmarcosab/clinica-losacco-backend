package br.com.clinicalosacco.pacientes.domain.usecase.impl;

import br.com.clinicalosacco.pacientes.adapters.controller.request.PacienteRequestModel;
import br.com.clinicalosacco.pacientes.adapters.controller.response.PacienteResponseModel;
import br.com.clinicalosacco.pacientes.adapters.database.PacienteRegisterDsGateway;
import br.com.clinicalosacco.pacientes.adapters.presenter.PacientePresenter;
import br.com.clinicalosacco.pacientes.domain.entitie.Paciente;
import br.com.clinicalosacco.pacientes.domain.factories.PacienteFactory;
import br.com.clinicalosacco.pacientes.domain.usecase.CreateUseCase;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;


@Slf4j
@Component
@RequiredArgsConstructor
public class CreatePacienteUseCaseImpl implements CreateUseCase {

    private final PacienteRegisterDsGateway pacienteRegisterDsGateway;
    private final PacientePresenter pacientePresenter;
    private final PacienteFactory pacienteFactory;

    @Override
    public PacienteResponseModel create(PacienteRequestModel pacienteRequestModel) {
        try {
            Paciente paciente = pacienteFactory.create(pacienteRequestModel);
            return pacientePresenter.prepareSuccessView(pacienteRegisterDsGateway.save(pacienteRequestModel));
        } catch (Exception e){
            log.error("Um erro ocorreu ao processar a requisicao", pacienteRequestModel);
            return pacientePresenter.prepareFailView(e.getMessage());
        }
    }

}
