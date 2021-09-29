package br.com.clinicalosacco.app.adapters.jpa;

import br.com.clinicalosacco.app.adapters.controllers.request.MedicoRequest;
import br.com.clinicalosacco.app.adapters.controllers.response.MedicoResponse;
import br.com.clinicalosacco.app.domain.usecases.MedicoService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicoJpa implements MedicoService {

    @Override
    public List<MedicoResponse> listar() {
        return null;
    }

    @Override
    public MedicoResponse criar(MedicoRequest request) {
        return null;
    }

    @Override
    public MedicoResponse atualizar(Integer id, MedicoRequest request) {
        return null;
    }

    @Override
    public MedicoResponse deletar(Integer id) {
        return null;
    }

    @Override
    public MedicoResponse buscarPorId(Integer id) {
        return null;
    }

    @Override
    public List<MedicoResponse> buscarPorNome(String nome) {
        return null;
    }
}
