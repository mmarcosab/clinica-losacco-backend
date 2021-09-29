package br.com.clinicalosacco.app.domain.factories;

import br.com.clinicalosacco.app.domain.entities.impl.*;
import br.com.clinicalosacco.app.domain.factories.impl.AtendimentoFactoryImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;


public class AtendimentoFactoryTest {

    private AtendimentoFactoryImpl factory;

    @BeforeEach
    public void init(){
        factory = new AtendimentoFactoryImpl();
    }


    @Test
    public void testCriarAtendimentoComSucesso() throws Exception {
        List<String> exames = new ArrayList<>();
        exames.add("exame 1");
        assertDoesNotThrow(() -> factory.create("descricao teste", exames, getMedico()));
    }


    private CommonPaciente getPaciente() throws Exception {
        return new CommonPaciente("nome teste", "12345645678", "12345678", LocalDate.now(), getEndereco(), getPlanoSaude(), new ArrayList<>());

    }

    private CommonEndereco getEndereco() throws Exception {
        return new CommonEndereco("rua teste", "123", "teste", "teste", "teste", "SP");
    }

    private br.com.clinicalosacco.app.domain.entities.impl.CommonPlanoSaude getPlanoSaude() throws Exception {
        return new CommonPlanoSaude("teste", "teste", "teste", "teste");
    }

    private CommonMedico getMedico() throws Exception {
        return new CommonMedico("nome", "12345678941", "12345678", "12545487", getEndereco());
    }


}
