package br.com.clinicalosacco.pacientes.adapters.database;

import br.com.clinicalosacco.pacientes.adapters.controller.request.EnderecoRequestModel;
import br.com.clinicalosacco.pacientes.adapters.controller.request.PacienteRequestModel;
import br.com.clinicalosacco.pacientes.adapters.controller.request.PlanoSaudeRequestModel;
import br.com.clinicalosacco.pacientes.adapters.database.mapper.EnderecoDataMapper;
import br.com.clinicalosacco.pacientes.adapters.database.mapper.PacienteDataMapper;
import br.com.clinicalosacco.pacientes.adapters.database.mapper.PlanoSaudeDataMapper;
import br.com.clinicalosacco.pacientes.adapters.database.repository.PacienteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import java.util.List;


@Component
@RequiredArgsConstructor
public class PacienteJpa implements PacienteRegisterDsGateway{

    private final PacienteRepository repository;
    private static final String NOT_FOUND = "Entidade nao encontrada a partir do id: ";

    @Override
    public boolean existsByName(String name) {
        return repository.existsByNome(name);
    }

    @Override
    public boolean existsById(String id) {
        return repository.existsById(id);
    }

    @Override
    public PacienteDataMapper save(PacienteRequestModel requestModel) {
        return repository.save(getPacienteFromRequest(requestModel));
    }

    @Override
    public List<PacienteDataMapper> getAll(){
        return repository.findAll();
    }

    @Override
    public PacienteDataMapper update(PacienteRequestModel requestModel, String id) {
        PacienteDataMapper pacienteDataMapper = getPacienteFromRequest(requestModel);
        pacienteDataMapper.setId(id);
        return repository.save(pacienteDataMapper);
    }

    @Override
    public void delete(String id) {
        repository.deleteById(id);
    }

    private PacienteDataMapper getPacienteFromRequest(PacienteRequestModel pacienteRequestModel){
        return PacienteDataMapper.builder()
                .nome(pacienteRequestModel.getNome())
                .cpf(pacienteRequestModel.getCpf())
                .dataNascimento(pacienteRequestModel.getDataNascimento())
                .email(pacienteRequestModel.getEmail())
                .telefone(pacienteRequestModel.getTelefone())
                .endereco(getEnderecoFromRequest(pacienteRequestModel.getEndereco()))
                .planoSaude(getPlanoSaudeFromRequest(pacienteRequestModel.getPlanoSaude()))
                .build();
    }

    private EnderecoDataMapper getEnderecoFromRequest(EnderecoRequestModel enderecoRequestModel){
        return EnderecoDataMapper.builder()
                .rua(enderecoRequestModel.getRua())
                .numero(enderecoRequestModel.getNumero())
                .complemento(enderecoRequestModel.getComplemento())
                .cidade(enderecoRequestModel.getCidade())
                .UF(enderecoRequestModel.getUF())
                .cep(enderecoRequestModel.getCep())
                .pais(enderecoRequestModel.getPais())
                .build();
    }

    private PlanoSaudeDataMapper getPlanoSaudeFromRequest(PlanoSaudeRequestModel planoSaudeRequestModel){
        return PlanoSaudeDataMapper.builder()
                .numeroOperacao(planoSaudeRequestModel.getNumeroRegistro())
                .tipo(planoSaudeRequestModel.getTipo())
                .build();
    }

}
