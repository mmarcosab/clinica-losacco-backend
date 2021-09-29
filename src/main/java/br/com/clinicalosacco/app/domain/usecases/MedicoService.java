package br.com.clinicalosacco.app.domain.usecases;

import br.com.clinicalosacco.app.adapters.controllers.request.MedicoRequest;
import br.com.clinicalosacco.app.adapters.controllers.response.MedicoResponse;

import java.util.List;

public interface MedicoService {
    List<MedicoResponse> listar();
    MedicoResponse criar(MedicoRequest request);
    MedicoResponse atualizar(Integer id, MedicoRequest request);
    MedicoResponse deletar(Integer id);
    MedicoResponse buscarPorId(Integer id);
    List<MedicoResponse> buscarPorNome(String nome);

}
