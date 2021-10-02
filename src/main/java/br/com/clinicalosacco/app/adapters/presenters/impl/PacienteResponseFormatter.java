package br.com.clinicalosacco.app.adapters.presenters.impl;

import br.com.clinicalosacco.app.adapters.controllers.response.EnderecoResponse;
import br.com.clinicalosacco.app.adapters.controllers.response.PacienteResponse;
import br.com.clinicalosacco.app.adapters.controllers.response.PlanoSaudeResponse;
import br.com.clinicalosacco.app.adapters.database.entities.EnderecoData;
import br.com.clinicalosacco.app.adapters.database.entities.PacienteData;
import br.com.clinicalosacco.app.adapters.database.entities.PlanoSaudeData;
import br.com.clinicalosacco.app.adapters.presenters.PacientePresenter;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ResponseStatusException;
import java.util.List;

@Component
public class PacienteResponseFormatter implements PacientePresenter {

    @Override
    public PacienteResponse prepareSuccessView(PacienteResponse response) {
        return response;
    }

    @Override
    public List<PacienteResponse> prepareSuccessView(List<PacienteResponse> response) {
        return response;
    }

    @Override
    public void prepareFailView(String error) {
        throw new ResponseStatusException(HttpStatus.CONFLICT, error);
    }

    //TODO converter de data pra response
    public static PacienteResponse mapDataToResponse(PacienteData pacienteData){
        return PacienteResponse.builder()
                .nome(pacienteData.getNome())
                .cpf(pacienteData.getCpf())
                .rg(pacienteData.getRg())
                .dataNascimento(pacienteData.getDataNascimento())
                .endereco(mapDataToResponse(pacienteData.getEndereco()))
//                .historico(pacienteData.getHistorico()) //TODO
                .planoSaude(mapDataToResponse(pacienteData.getPlanoSaude()))
                .build();
    }


    private static EnderecoResponse mapDataToResponse(EnderecoData enderecoData){
        return EnderecoResponse.builder()
                .rua(enderecoData.getRua())
                .bairro(enderecoData.getBairro())
                .cidade(enderecoData.getCidade())
                .complemento(enderecoData.getComplemento())
                .uf(enderecoData.getUf())
                .build();
    }

    private static PlanoSaudeResponse mapDataToResponse(PlanoSaudeData planoSaudeData){
        return PlanoSaudeResponse.builder()
                .codigoIdentificacao(planoSaudeData.getCodigoIdentificacao())
                .plano(planoSaudeData.getPlano())
                .tipo(planoSaudeData.getTipo())
                .cobertura(planoSaudeData.getCobertura())
                .build();
    }


}
