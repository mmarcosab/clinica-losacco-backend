package br.com.clinicalosacco.app.domain.entities;


import br.com.clinicalosacco.app.domain.entities.impl.*;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class CommonAtendimentoTest {

    @Test
    public void testCriarAtendimentoComSucesso(){
        List<String> exames = new ArrayList<>();
        exames.add("exame 1");
        assertDoesNotThrow(() -> new CommonAtendimento("descricao teste", exames, getPaciente(), getMedico()));
    }

    @Test
    public void testCriarAtendimentoComPacienteInvalido() {
        List<String> exames = new ArrayList<>();
        exames.add("exame 1");
        try {
            CommonAtendimento c = new CommonAtendimento("descricao teste", exames, null, getMedico());
        } catch (Exception e){
            assertEquals("paciente invalido, preencher corretamente", e.getMessage());
        }
    }

    @Test
    public void testCriarAtendimentoComMedicoInvalido(){
        List<String> exames = new ArrayList<>();
        exames.add("exame 1");
        try {
            CommonAtendimento c = new CommonAtendimento("descricao teste", exames, getPaciente(), null);
        } catch (Exception e){
            assertEquals("medico invalido, preencher corretamente", e.getMessage());
        }
    }

    @Test
    public void testCriarAtendimentoComDescricaoInvalida(){
        List<String> exames = new ArrayList<>();
        exames.add("exame 1");
        try {
            CommonAtendimento c = new CommonAtendimento("", exames, null, getMedico());
        } catch (Exception e){
            assertEquals("descricao invalida, preencher corretamente", e.getMessage());
        }
    }


    private CommonPaciente getPaciente() throws Exception {
        return new CommonPaciente("nome teste", "12345645678", "12345678", LocalDate.now(), getEndereco(), getPlanoSaude(), new ArrayList<>());

    }

    private CommonEndereco getEndereco() throws Exception {
        return new CommonEndereco("rua teste", "123", "teste", "teste", "teste", "SP");
    }

    private CommonPlanoSaude getPlanoSaude() throws Exception {
        return new CommonPlanoSaude("teste", "teste", "teste", "teste");
    }

    private CommonMedico getMedico() throws Exception {
        return new CommonMedico("nome", "12345678941", "12345678", "12545487", getEndereco());
    }

}
