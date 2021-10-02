package br.com.clinicalosacco.app.adapters.controllers.response;

import br.com.clinicalosacco.app.domain.entities.Medico;
import lombok.Builder;
import java.util.List;


@Builder
public class AtendimentoResponse {

    private String descricao;
    private List<String> exames;
    private Medico medico;

}
