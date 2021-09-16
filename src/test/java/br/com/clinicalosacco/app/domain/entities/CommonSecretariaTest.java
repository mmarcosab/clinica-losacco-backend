package br.com.clinicalosacco.app.domain.entities;

import br.com.clinicalosacco.app.domain.entities.impl.CommonEndereco;
import br.com.clinicalosacco.app.domain.entities.impl.CommonSecretaria;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;


public class CommonSecretariaTest {

    @Test
    public void testCriarSecretariaComSucesso() throws Exception {
        CommonEndereco endereco = new CommonEndereco("teste", "233","sao paulo",  "complemento", "teste bairro", "SP");
        CommonSecretaria secretaria = new CommonSecretaria("Maria", "12345678914", "12345678", LocalDate.now(), endereco);
        assertEquals("Maria", secretaria.getNome());
        assertEquals("12345678914", secretaria.getCpf());
        assertEquals("12345678", secretaria.getRg());
        assertEquals(LocalDate.now(), secretaria.getDataNascimento());
        assertEquals(endereco, secretaria.getEndereco());
    }

    @Test
    public void testCriarSecretariaComNomeInvalido(){
        try {
            CommonEndereco endereco = new CommonEndereco("teste", "233", "sao paulo", "complemento", "teste bairro", "SP");
            CommonSecretaria secretaria = new CommonSecretaria("", "12345678914", "12345678", LocalDate.now(), endereco);
        } catch(Exception e){
            assertEquals("nome invalido, preencher corretamente", e.getMessage());
        }
    }

    @Test
    public void testCriarSecretariaComNomeNulo(){
        try {
            CommonEndereco endereco = new CommonEndereco("teste", "233", "sao paulo", "complemento", "teste bairro", "SP");
            CommonSecretaria secretaria = new CommonSecretaria(null, "12345678914", "12345678", LocalDate.now(), endereco);
        } catch(Exception e){
            assertEquals("nome invalido, preencher corretamente", e.getMessage());
        }
    }

    @Test
    public void testCriarSecretariaComCpfInvalido(){
        try {
            CommonEndereco endereco = new CommonEndereco("teste", "233", "sao paulo", "complemento", "teste bairro", "SP");
            CommonSecretaria secretaria = new CommonSecretaria("Maria", "", "12345678", LocalDate.now(), endereco);
        } catch(Exception e){
            assertEquals("cpf invalido, preencher corretamente", e.getMessage());
        }
    }

    @Test
    public void testCriarSecretariaComCpfNulo(){
        try {
            CommonEndereco endereco = new CommonEndereco("teste", "233", "sao paulo", "complemento", "teste bairro", "SP");
            CommonSecretaria secretaria = new CommonSecretaria("Maria", null, "12345678", LocalDate.now(), endereco);
        } catch(Exception e){
            assertEquals("cpf invalido, preencher corretamente", e.getMessage());
        }
    }

    @Test
    public void testCriarSecretariaComRgInvalido(){
        try {
            CommonEndereco endereco = new CommonEndereco("teste", "233", "sao paulo", "complemento", "teste bairro", "SP");
            CommonSecretaria secretaria = new CommonSecretaria("Maria", "12345678914", "", LocalDate.now(), endereco);
        } catch(Exception e){
            assertEquals("rg invalido, preencher corretamente", e.getMessage());
        }
    }

    @Test
    public void testCriarSecretariaComRgNulo(){
        try {
            CommonEndereco endereco = new CommonEndereco("teste", "233", "sao paulo", "complemento", "teste bairro", "SP");
            CommonSecretaria secretaria = new CommonSecretaria("Maria", "12345678914", null, LocalDate.now(), endereco);
        } catch(Exception e){
            assertEquals("rg invalido, preencher corretamente", e.getMessage());
        }
    }

    @Test
    public void testCriarSecretariaComDataNascimentoInvalida(){
        try {
            CommonEndereco endereco = new CommonEndereco("teste", "233", "sao paulo", "complemento", "teste bairro", "SP");
            CommonSecretaria secretaria = new CommonSecretaria("Maria", "12345678914", "12345678", null, endereco);
        } catch(Exception e){
            assertEquals("data de nascimento invalida, preencher corretamente", e.getMessage());
        }
    }

    @Test
    public void testCriarSecretariaComEnderecoInvalid0(){
        try {
            CommonSecretaria secretaria = new CommonSecretaria("Maria", "12345678914", "12345678", LocalDate.now(), null);
        } catch(Exception e){
            assertEquals("endereco invalido, preencher corretamente", e.getMessage());
        }
    }


}
