package br.com.clinicalosacco.app.domain.factories;

import br.com.clinicalosacco.app.domain.factories.impl.PlanoSaudeFactoryImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;


public class PlanoSaudeFactoryTest {

    private PlanoSaudeFactoryImpl factory;


    @BeforeEach
    public void init(){
        factory = new PlanoSaudeFactoryImpl();
    }

    @Test
    public void testCriarPlanoSaudeComSucesso() throws Exception {
        assertDoesNotThrow(() -> factory.create("Tipo 1", "12315454254215451", "Plano 3", "Enfermagem"));
    }
}
