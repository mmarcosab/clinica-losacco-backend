package br.com.clinicalosacco.pacientes.adapters.presenter.formatter;

import br.com.clinicalosacco.pacientes.adapters.controller.response.EnderecoResponseModel;
import br.com.clinicalosacco.pacientes.adapters.controller.response.PacienteResponseModel;
import br.com.clinicalosacco.pacientes.adapters.controller.response.PlanoSaudeResponseModel;
import br.com.clinicalosacco.pacientes.adapters.database.mapper.PacienteDataMapper;
import br.com.clinicalosacco.pacientes.adapters.presenter.PacientePresenter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;

@Slf4j
@Component
public class PacienteResponseFormatter implements PacientePresenter {

    @Override
    public PacienteResponseModel prepareSuccessView(PacienteDataMapper pacienteDataMapper) {
        log.info("Preparando a view de sucesso com a mensagem: {}", pacienteDataMapper);
        return dataToResponseModel(pacienteDataMapper);
    }

    @Override
    public List<PacienteResponseModel> prepareListSuccessView(List<PacienteDataMapper> pacientesData){
        log.info("Preparando a view de sucesso com a mensagem: {}", pacientesData);
        return dataToListResponseModel(pacientesData);
    }

    @Override
    public PacienteResponseModel prepareFailView(String error) {
        log.error("Preparando a view de falha com a mensagem: {}", error);
        throw new ResponseStatusException(HttpStatus.CONFLICT, error);
    }


    private PacienteResponseModel dataToResponseModel(PacienteDataMapper pacienteDataMapper) {
        return PacienteResponseModel.builder()
                .id(pacienteDataMapper.getId())
                .cpf(pacienteDataMapper.getCpf())
                .dataNascimento(pacienteDataMapper.getDataNascimento())
                .email(pacienteDataMapper.getEmail())
                .telefone(pacienteDataMapper.getTelefone())
                .endereco(EnderecoResponseModel.builder()
                        .rua(pacienteDataMapper.getEndereco().getRua())
                        .cep(pacienteDataMapper.getEndereco().getCep())
                        .cidade(pacienteDataMapper.getEndereco().getCidade())
                        .complemento(pacienteDataMapper.getEndereco().getComplemento())
                        .UF(pacienteDataMapper.getEndereco().getUF())
                        .pais(pacienteDataMapper.getEndereco().getPais())
                        .build())
                .planoSaude(PlanoSaudeResponseModel.builder()
                        .numeroRegistro(pacienteDataMapper.getPlanoSaude().getNumeroOperacao())
                        .tipo(pacienteDataMapper.getPlanoSaude().getTipo())
                        .build())
                .build();
    }

    private List<PacienteResponseModel> dataToListResponseModel(List<PacienteDataMapper> pacientesDataMapper) {
        List<PacienteResponseModel> pacientes = new ArrayList<>();
        for(PacienteDataMapper p : pacientesDataMapper) {
            pacientes.add(PacienteResponseModel.builder()
                    .id(p.getId())
                    .cpf(p.getCpf())
                    .dataNascimento(p.getDataNascimento())
                    .email(p.getEmail())
                    .telefone(p.getTelefone())
                    .endereco(EnderecoResponseModel.builder()
                            .rua(p.getEndereco().getRua())
                            .cep(p.getEndereco().getCep())
                            .cidade(p.getEndereco().getCidade())
                            .complemento(p.getEndereco().getComplemento())
                            .UF(p.getEndereco().getUF())
                            .pais(p.getEndereco().getPais())
                            .build())
                    .planoSaude(PlanoSaudeResponseModel.builder()
                            .numeroRegistro(p.getPlanoSaude().getNumeroOperacao())
                            .tipo(p.getPlanoSaude().getTipo())
                            .build())
                    .build());
        }
        return pacientes;
    }

}
