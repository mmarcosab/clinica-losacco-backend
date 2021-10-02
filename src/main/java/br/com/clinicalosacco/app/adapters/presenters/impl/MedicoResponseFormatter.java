package br.com.clinicalosacco.app.adapters.presenters.impl;

import br.com.clinicalosacco.app.adapters.controllers.response.EnderecoResponse;
import br.com.clinicalosacco.app.adapters.controllers.response.MedicoResponse;
import br.com.clinicalosacco.app.adapters.database.entities.EnderecoData;
import br.com.clinicalosacco.app.adapters.database.entities.MedicoData;
import br.com.clinicalosacco.app.adapters.presenters.MedicoPresenter;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ResponseStatusException;
import java.util.List;

@Component
public class MedicoResponseFormatter implements MedicoPresenter {

    @Override
    public MedicoResponse prepareSuccessView(MedicoResponse medicoResponse) {
        return medicoResponse;
    }

    @Override
    public List<MedicoResponse> prepareSuccessView(List<MedicoResponse> medicos) {
        return medicos;
    }

    @Override
    public void prepareFailView(String error) {
        throw new ResponseStatusException(HttpStatus.CONFLICT, error);
    }

    public static MedicoResponse mapDataToResponse(MedicoData medicoData){
        return MedicoResponse.builder()
                .nome(medicoData.getNome())
                .rg(medicoData.getRg())
                .cpf(medicoData.getCpf())
                .crm(medicoData.getCrm())
                .endereco(mapDataToResponse(medicoData.getEndereco()))
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


}
