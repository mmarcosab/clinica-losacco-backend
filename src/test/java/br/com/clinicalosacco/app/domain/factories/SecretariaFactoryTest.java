package br.com.clinicalosacco.app.domain.factories;

import br.com.clinicalosacco.app.domain.entities.impl.CommonEndereco;
import br.com.clinicalosacco.app.domain.factories.impl.SecretariaFactoryImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

public class SecretariaFactoryTest {

    private SecretariaFactoryImpl factory;

    @BeforeEach
    public void init(){
        factory = new SecretariaFactoryImpl();
    }

    @Test
    public void testCriarSecretariaComSucesso() throws Exception {
        CommonEndereco e = new CommonEndereco("teste", "233","sao paulo",  "complemento", "teste bairro", "SP");
        assertDoesNotThrow(() -> factory.create("Jose", "12345678914", "12345678", LocalDate.now(), e));
    }
}
