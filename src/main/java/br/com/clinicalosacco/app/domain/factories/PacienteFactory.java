package br.com.clinicalosacco.app.domain.factories;

import br.com.clinicalosacco.app.domain.entities.Atendimento;
import br.com.clinicalosacco.app.domain.entities.Endereco;
import br.com.clinicalosacco.app.domain.entities.Paciente;
import br.com.clinicalosacco.app.domain.entities.PlanoSaude;

import java.time.LocalDate;
import java.util.List;

public interface PacienteFactory {
    Paciente create(String nome, String cpf, String rg, LocalDate dataNascimento, Endereco endereco, PlanoSaude planoSaude, List<Atendimento> historico) throws Exception;
}
