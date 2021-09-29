package br.com.clinicalosacco.app.domain.usecases;

import br.com.clinicalosacco.app.adapters.controllers.request.AtendimentoRequest;
import br.com.clinicalosacco.app.adapters.controllers.request.PacienteRequest;
import br.com.clinicalosacco.app.adapters.controllers.response.PacienteResponse;
import java.util.List;

public interface PacienteService {
    List<PacienteResponse> listar();
    PacienteResponse criar(PacienteRequest request);
    PacienteResponse atualizar(Integer id, PacienteRequest request);
    PacienteResponse deletar(Integer id);
    PacienteResponse buscarPorId(Integer id);
    List<PacienteResponse> buscarPorNome(String nome);
    PacienteResponse marcarAtendimento(Integer id, AtendimentoRequest request);
}
