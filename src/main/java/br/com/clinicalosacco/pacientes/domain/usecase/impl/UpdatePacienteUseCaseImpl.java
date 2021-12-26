package br.com.clinicalosacco.pacientes.domain.usecase.impl;

import br.com.clinicalosacco.pacientes.adapters.controller.request.PacienteRequestModel;
import br.com.clinicalosacco.pacientes.adapters.controller.response.EnderecoResponseModel;
import br.com.clinicalosacco.pacientes.adapters.controller.response.PacienteResponseModel;
import br.com.clinicalosacco.pacientes.adapters.controller.response.PlanoSaudeResponseModel;
import br.com.clinicalosacco.pacientes.adapters.database.PacienteRegisterDsGateway;
import br.com.clinicalosacco.pacientes.adapters.database.mapper.PacienteDataMapper;
import br.com.clinicalosacco.pacientes.adapters.presenter.PacientePresenter;
import br.com.clinicalosacco.pacientes.domain.entitie.Paciente;
import br.com.clinicalosacco.pacientes.domain.factories.PacienteFactory;
import br.com.clinicalosacco.pacientes.domain.usecase.UpdateUseCase;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;


@Slf4j
@Component
@RequiredArgsConstructor
public class UpdatePacienteUseCaseImpl implements UpdateUseCase {

    private final PacienteRegisterDsGateway pacienteRegisterDsGateway;
    private final PacientePresenter pacientePresenter;
    private final PacienteFactory pacienteFactory;

    @Override
    public PacienteResponseModel update(PacienteRequestModel pacienteRequestModel, String id) {
        try {
            Paciente paciente = pacienteFactory.create(pacienteRequestModel);
            PacienteDataMapper pacienteDataMapper = pacienteRegisterDsGateway.update(pacienteRequestModel, id);
            return pacientePresenter.prepareSuccessView(pacienteDataMapper);
        } catch (Exception e) {
            log.error("Um erro ocorreu ao processar a requisicao", pacienteRequestModel);
            return pacientePresenter.prepareFailView(e.getMessage());
        }
    }

    private PacienteResponseModel mapToResponseModel(PacienteDataMapper pacienteDataMapper) {
        return PacienteResponseModel.builder()
                .id(pacienteDataMapper.getId())
                .nome(pacienteDataMapper.getNome())
                .cpf(pacienteDataMapper.getCpf())
                .dataNascimento(pacienteDataMapper.getDataNascimento())
                .email(pacienteDataMapper.getEmail())
                .telefone(pacienteDataMapper.getTelefone())
                .endereco(EnderecoResponseModel.builder()
                        .rua(pacienteDataMapper.getEndereco().getRua())
                        .cidade(pacienteDataMapper.getEndereco().getCidade())
                        .complemento(pacienteDataMapper.getEndereco().getComplemento())
                        .cep(pacienteDataMapper.getEndereco().getCep())
                        .numero(pacienteDataMapper.getEndereco().getNumero())
                        .pais(pacienteDataMapper.getEndereco().getPais())
                        .UF(pacienteDataMapper.getEndereco().getUF())
                        .build())
                .planoSaude(PlanoSaudeResponseModel.builder()
                        .numeroRegistro(pacienteDataMapper.getPlanoSaude().getNumeroOperacao())
                        .tipo(pacienteDataMapper.getPlanoSaude().getTipo())
                        .build())
                .build();
    }

}
