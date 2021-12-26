package br.com.clinicalosacco.pacientes.adapters.database.mapper;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Getter
@Setter
@Builder
@Document("Pacientes")
public class PacienteDataMapper {

    @Id
    private String id;
    private String nome;
    private String cpf;
    private Date dataNascimento;
    private String email;
    private String telefone;
    private EnderecoDataMapper endereco;
    private PlanoSaudeDataMapper planoSaude;

}
