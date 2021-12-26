package br.com.clinicalosacco.pacientes.adapters.database.mapper;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;


@Getter
@Setter
@Builder
@Document("Enderecos")
public class EnderecoDataMapper {

    private String rua;
    private int numero;
    private String complemento;
    private String cidade;
    private String UF;
    private String cep;
    private String pais;

}
