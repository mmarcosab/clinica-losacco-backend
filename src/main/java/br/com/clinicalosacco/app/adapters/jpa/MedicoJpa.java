package br.com.clinicalosacco.app.adapters.jpa;

import br.com.clinicalosacco.app.adapters.controllers.request.MedicoRequest;
import br.com.clinicalosacco.app.adapters.controllers.response.MedicoResponse;
import br.com.clinicalosacco.app.adapters.database.repository.MedicoRepository;
import br.com.clinicalosacco.app.adapters.presenters.MedicoPresenter;
import br.com.clinicalosacco.app.domain.usecases.MedicoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
@RequiredArgsConstructor
public class MedicoJpa implements MedicoService {

    private final MedicoRepository repository;
    private final MedicoPresenter presenter;

    //TODO implementar os métodos

    @Override
    public List<MedicoResponse> listar() {
        return presenter.prepareSuccessView(Arrays.asList(new MedicoResponse()));
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
