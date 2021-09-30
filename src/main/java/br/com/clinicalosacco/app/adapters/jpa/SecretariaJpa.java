package br.com.clinicalosacco.app.adapters.jpa;

import br.com.clinicalosacco.app.adapters.controllers.request.SecretariaRequest;
import br.com.clinicalosacco.app.adapters.controllers.response.PacienteResponse;
import br.com.clinicalosacco.app.adapters.controllers.response.SecretariaResponse;
import br.com.clinicalosacco.app.domain.usecases.SecretariaService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SecretariaJpa implements SecretariaService {

    //TODO implementar os metodos

    @Override
    public List<PacienteResponse> listar() {
        return null;
    }

    @Override
    public SecretariaResponse criar(SecretariaRequest request) {
        return null;
    }

    @Override
    public SecretariaResponse atualizar(Integer id, SecretariaRequest request) {
        return null;
    }

    @Override
    public SecretariaResponse deletar(Integer id) {
        return null;
    }

    @Override
    public SecretariaResponse buscarPorId(Integer id) {
        return null;
    }

    @Override
    public List<SecretariaResponse> buscarPorNome(String nome) {
        return null;
    }
}
