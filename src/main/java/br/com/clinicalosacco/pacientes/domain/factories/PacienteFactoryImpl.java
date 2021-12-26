package br.com.clinicalosacco.pacientes.domain.factories;

import br.com.clinicalosacco.pacientes.adapters.controller.request.EnderecoRequestModel;
import br.com.clinicalosacco.pacientes.adapters.controller.request.PacienteRequestModel;
import br.com.clinicalosacco.pacientes.adapters.controller.request.PlanoSaudeRequestModel;
import br.com.clinicalosacco.pacientes.domain.entitie.Endereco;
import br.com.clinicalosacco.pacientes.domain.entitie.Paciente;
import br.com.clinicalosacco.pacientes.domain.entitie.PacienteImpl;
import br.com.clinicalosacco.pacientes.domain.entitie.PlanoSaude;
import org.springframework.stereotype.Component;

@Component
public class PacienteFactoryImpl implements PacienteFactory{

    @Override
    public Paciente create(PacienteRequestModel pacienteRequestModel) {

        Endereco endereco = createEndereco(pacienteRequestModel.getEndereco());
        PlanoSaude planoSaude = createPlanoSaude(pacienteRequestModel.getPlanoSaude());

        return new PacienteImpl(pacienteRequestModel.getNome(),
                            pacienteRequestModel.getCpf(),
                            pacienteRequestModel.getDataNascimento(),
                            pacienteRequestModel.getEmail(),
                            pacienteRequestModel.getTelefone(),
                            endereco,
                            planoSaude);

    }

    private Endereco createEndereco(EnderecoRequestModel enderecoRequestModel){
        return new Endereco(enderecoRequestModel.getRua(), enderecoRequestModel.getNumero(), enderecoRequestModel.getComplemento(),
                enderecoRequestModel.getCidade(), enderecoRequestModel.getUF(), enderecoRequestModel.getCep(), enderecoRequestModel.getPais());
    }

    private PlanoSaude createPlanoSaude(PlanoSaudeRequestModel planoSaudeRequestModel){
        return new PlanoSaude(planoSaudeRequestModel.getNumeroRegistro(), planoSaudeRequestModel.getTipo());
    }
}
