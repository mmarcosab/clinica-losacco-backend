package br.com.clinicalosacco.app.domain.factories;

import br.com.clinicalosacco.app.domain.factories.impl.EnderecoFactoryImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class EnderecoFactoryImplTest {

    private EnderecoFactoryImpl factory;

    @BeforeEach
    public void init(){
        factory =  new EnderecoFactoryImpl();
    }

    @Test
    public void testCriarEnderecoComSucesso() throws Exception {
        var endereco = factory.create("teste", "233","sao paulo",  "complemento", "teste bairro", "SP");
        assertNotNull(endereco);
    }
}
