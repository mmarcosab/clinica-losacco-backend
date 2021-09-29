package br.com.clinicalosacco.app.adapters.jpa;

import br.com.clinicalosacco.app.adapters.controllers.request.AtendimentoRequest;
import br.com.clinicalosacco.app.adapters.controllers.request.PacienteRequest;
import br.com.clinicalosacco.app.adapters.controllers.response.PacienteResponse;
import br.com.clinicalosacco.app.domain.usecases.PacienteService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PacienteJpa implements PacienteService {

    @Override
    public List<PacienteResponse> listar() {
        return null;
    }

    @Override
    public PacienteResponse criar(PacienteRequest request) {
        return null;
    }

    @Override
    public PacienteResponse atualizar(Integer id, PacienteRequest request) {
        return null;
    }

    @Override
    public PacienteResponse deletar(Integer id) {
        return null;
    }

    @Override
    public PacienteResponse buscarPorId(Integer id) {
        return null;
    }

    @Override
    public List<PacienteResponse> buscarPorNome(String nome) {
        return null;
    }

    @Override
    public PacienteResponse marcarAtendimento(Integer id, AtendimentoRequest request) {
        return null;
    }
}
