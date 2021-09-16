package br.com.clinicalosacco.app.domain.factories.impl;

import br.com.clinicalosacco.app.domain.entities.Atendimento;
import br.com.clinicalosacco.app.domain.entities.Endereco;
import br.com.clinicalosacco.app.domain.entities.Paciente;
import br.com.clinicalosacco.app.domain.entities.PlanoSaude;
import br.com.clinicalosacco.app.domain.entities.impl.CommonPaciente;
import br.com.clinicalosacco.app.domain.factories.PacienteFactory;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class PacienteFactoryImpl implements PacienteFactory {

    @Override
    public Paciente create(String nome, String cpf, String rg, LocalDate dataNascimento, Endereco endereco, PlanoSaude planoSaude, List<Atendimento> historico) throws Exception {
        return new CommonPaciente(nome, cpf, rg, dataNascimento, endereco, planoSaude, historico);
    }
}
