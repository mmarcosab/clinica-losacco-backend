package br.com.clinicalosacco.app.domain.usecases;

import br.com.clinicalosacco.app.adapters.controllers.request.SecretariaRequest;
import br.com.clinicalosacco.app.adapters.controllers.response.PacienteResponse;
import br.com.clinicalosacco.app.adapters.controllers.response.SecretariaResponse;

import java.util.List;

public interface SecretariaService {
    List<PacienteResponse> listar();
    SecretariaResponse criar(SecretariaRequest request);
    SecretariaResponse atualizar(Integer id, SecretariaRequest request);
    SecretariaResponse deletar(Integer id);
    SecretariaResponse buscarPorId(Integer id);
    List<SecretariaResponse> buscarPorNome(String nome);
}
