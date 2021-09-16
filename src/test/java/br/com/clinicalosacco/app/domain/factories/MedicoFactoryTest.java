package br.com.clinicalosacco.app.domain.factories;

import br.com.clinicalosacco.app.domain.entities.impl.CommonEndereco;
import br.com.clinicalosacco.app.domain.factories.impl.MedicoFactoryImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

public class MedicoFactoryTest {

    private MedicoFactoryImpl factory;

    @BeforeEach
    public void init(){
        factory = new MedicoFactoryImpl();
    }

    @Test
    public void testCriarMedicoComSucesso() throws Exception {
        CommonEndereco e = new CommonEndereco("teste", "233","sao paulo",  "complemento", "teste bairro", "SP");
        assertDoesNotThrow(() -> factory.create("Jose", "12345678914", "12345678", "2145614", e));
    }
}
