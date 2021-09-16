package br.com.clinicalosacco.app.domain.entities;

import br.com.clinicalosacco.app.domain.entities.impl.CommonPlanoSaude;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CommonPlanoSaudeTest {

    @Test
    public void testCriarPlanoSaudeComSucesso() throws Exception {
        CommonPlanoSaude commonPlanoSaude = new CommonPlanoSaude("Tipo 1", "12315454254215451", "Plano 3", "Enfermagem");
        assertEquals("Tipo 1", commonPlanoSaude.getTipo());
        assertEquals("12315454254215451", commonPlanoSaude.getCodigoIdentificacao());
        assertEquals("Plano 3", commonPlanoSaude.getPlano());
        assertEquals("Enfermagem", commonPlanoSaude.getCobertura());
    }

    @Test
    public void testCriarPlanoSaudeComTipoInvalido() {
        try {
            CommonPlanoSaude commonPlanoSaude = new CommonPlanoSaude("", "12315454254215451", "Plano 3", "Enfermagem");
        } catch (Exception e) {
            assertEquals("tipo invalido, preencher corretamente", e.getMessage());
        }
    }

    @Test
    public void testCriarPlanoSaudeComTipoNulo() {
        try {
            CommonPlanoSaude commonPlanoSaude = new CommonPlanoSaude(null, "12315454254215451", "Plano 3", "Enfermagem");
        } catch (Exception e) {
            assertEquals("tipo invalido, preencher corretamente", e.getMessage());
        }
    }

    @Test
    public void testCriarPlanoSaudeComCodigoIdentificacaoInvalido() {
        try {
            CommonPlanoSaude commonPlanoSaude = new CommonPlanoSaude("Tipo 1", "", "Plano 3", "Enfermagem");
        } catch (Exception e) {
            assertEquals("codigo identificacao invalido, preencher corretamente", e.getMessage());
        }
    }

    @Test
    public void testCriarPlanoSaudeComCodigoIdentificacaoNulo() {
        try {
            CommonPlanoSaude commonPlanoSaude = new CommonPlanoSaude("Tipo 1", null, "Plano 3", "Enfermagem");
        } catch (Exception e) {
            assertEquals("codigo identificacao invalido, preencher corretamente", e.getMessage());
        }
    }

    @Test
    public void testCriarPlanoSaudeComPlanoInvalido() {
        try {
            CommonPlanoSaude commonPlanoSaude = new CommonPlanoSaude("Tipo 1", "12315454254215451", "", "Enfermagem");
        } catch (Exception e) {
            assertEquals("plano invalido, preencher corretamente", e.getMessage());
        }
    }

    @Test
    public void testCriarPlanoSaudePlanoNulo() {
        try {
            CommonPlanoSaude commonPlanoSaude = new CommonPlanoSaude("Tipo 1", "12315454254215451", null, "Enfermagem");
        } catch (Exception e) {
            assertEquals("plano invalido, preencher corretamente", e.getMessage());
        }
    }

    @Test
    public void testCriarPlanoSaudeComCoberturaInvalida() {
        try {
            CommonPlanoSaude commonPlanoSaude = new CommonPlanoSaude("Tipo 1", "12315454254215451", "Plano 3", "");
        } catch (Exception e) {
            assertEquals("cobertura invalida, preencher corretamente", e.getMessage());
        }
    }

    @Test
    public void testCriarPlanoSaudeCoberturaNulo() {
        try {
            CommonPlanoSaude commonPlanoSaude = new CommonPlanoSaude("Tipo 1", "12315454254215451", "Plano 3", null);
        } catch (Exception e) {
            assertEquals("cobertura invalida, preencher corretamente", e.getMessage());
        }
    }

}
