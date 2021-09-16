package br.com.clinicalosacco.app.domain.factories;

import br.com.clinicalosacco.app.domain.entities.impl.CommonEndereco;
import br.com.clinicalosacco.app.domain.entities.impl.CommonPlanoSaude;
import br.com.clinicalosacco.app.domain.factories.impl.PacienteFactoryImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.time.LocalDate;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

public class PacienteFactoryTest {

    private PacienteFactoryImpl factory;

    @BeforeEach
    public void init(){
        factory = new PacienteFactoryImpl();
    }

    @Test
    public void testCriarPacienteComSucesso() throws Exception {
        CommonEndereco e = new CommonEndereco("teste", "233","sao paulo",  "complemento", "teste bairro", "SP");
        CommonPlanoSaude commonPlanoSaude = new CommonPlanoSaude("Tipo 1", "12315454254215451", "Plano 3", "teste");
        assertDoesNotThrow(() -> factory.create("Jose", "12345678914", "12345678", LocalDate.now(), e, commonPlanoSaude, new ArrayList<>()));
    }
}
