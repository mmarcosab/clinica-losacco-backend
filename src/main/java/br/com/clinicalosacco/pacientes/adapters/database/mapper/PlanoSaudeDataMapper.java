package br.com.clinicalosacco.pacientes.adapters.database.mapper;

import lombok.Builder;
import lombok.Getter;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Builder
@Document("PlanosSaude")
public class PlanoSaudeDataMapper {

    private String numeroOperacao;
    private String tipo;

}
