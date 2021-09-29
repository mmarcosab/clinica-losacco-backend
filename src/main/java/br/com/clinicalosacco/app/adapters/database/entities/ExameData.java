package br.com.clinicalosacco.app.adapters.database.entities;

import lombok.Builder;
import lombok.Getter;
import javax.persistence.*;

@Builder
@Getter
@Embeddable
@Entity
public class ExameData {

    @EmbeddedId
    private Integer id;

    private String nome;

}
