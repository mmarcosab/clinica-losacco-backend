package br.com.clinicalosacco.app.domain.entities;

import br.com.clinicalosacco.app.domain.entities.impl.CommonEndereco;
import br.com.clinicalosacco.app.domain.entities.impl.CommonMedico;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CommonMedicoTest {

    @Test
    public void testCriarEnderecoComSucesso() throws Exception {
        CommonEndereco e = new CommonEndereco("teste", "233","sao paulo",  "complemento", "teste bairro", "SP");
        CommonMedico medico = new CommonMedico("Jose", "12345678914", "12345678", "2145614", e);
        assertEquals("Jose", medico.getNome());
        assertEquals("12345678914", medico.getCpf());
        assertEquals("12345678", medico.getRg());
        assertEquals("2145614", medico.getCrm());
        assertEquals(e, medico.getEndereco());
    }

    @Test
    public void testCriarMedicoComNomeInvalido(){
        try {
            CommonEndereco e = new CommonEndereco("teste", "233","sao paulo",  "complemento", "teste bairro", "SP");
            CommonMedico medico = new CommonMedico("", "12345678914", "12345678", "2145614", e);
        } catch(Exception e){
            assertEquals("nome invalido, preencher corretamente", e.getMessage());
        }
    }

    @Test
    public void testCriarMedicoComNomeNulo(){
        try {
            CommonMedico medico = new CommonMedico(null, "12345678914", "12345678", "2145614", null);
        } catch(Exception e){
            assertEquals("nome invalido, preencher corretamente", e.getMessage());
        }
    }

    @Test
    public void testCriarMedicoComCpfInvalido(){
        try {
            CommonEndereco e = new CommonEndereco("teste", "233","sao paulo",  "complemento", "teste bairro", "SP");
            CommonMedico medico = new CommonMedico("Jose", "", "12345678", "2145614", e);
        } catch(Exception e){
            assertEquals("cpf invalido, preencher corretamente", e.getMessage());
        }
    }

    @Test
    public void testCriarMedicoComCpfNulo(){
        try {
            CommonEndereco e = new CommonEndereco("teste", "233","sao paulo",  "complemento", "teste bairro", "SP");
            CommonMedico medico = new CommonMedico("Jose", null, "12345678", "2145614", e);
        } catch(Exception e){
            assertEquals("cpf invalido, preencher corretamente", e.getMessage());
        }
    }

    @Test
    public void testCriarMedicoComRgInvalido(){
        try {
            CommonEndereco e = new CommonEndereco("teste", "233","sao paulo",  "complemento", "teste bairro", "SP");
            CommonMedico medico = new CommonMedico("Jose", "12345678914", "", "2145614", e);
        } catch(Exception e){
            assertEquals("rg invalido, preencher corretamente", e.getMessage());
        }
    }

    @Test
    public void testCriarMedicoComRgNulo(){
        try {
            CommonEndereco e = new CommonEndereco("teste", "233","sao paulo",  "complemento", "teste bairro", "SP");
            CommonMedico medico = new CommonMedico("Jose", "12345678914", null, "2145614", e);
        } catch(Exception e){
            assertEquals("rg invalido, preencher corretamente", e.getMessage());
        }
    }

    @Test
    public void testCriaMedicoComCrmInvalido(){
        try {
            CommonEndereco e = new CommonEndereco("teste", "233","sao paulo",  "complemento", "teste bairro", "SP");
            CommonMedico medico = new CommonMedico("Jose", "12345678914", "12345678", "", e);
        } catch(Exception e){
            assertEquals("crm invalido, preencher corretamente", e.getMessage());
        }
    }

    @Test
    public void testCriarMedicoComCrmNulo(){
        try {
            CommonEndereco e = new CommonEndereco("teste", "233","sao paulo",  "complemento", "teste bairro", "SP");
            CommonMedico medico = new CommonMedico("Jose", "12345678914", "12345678", null, e);
        } catch(Exception e){
            assertEquals("crm invalido, preencher corretamente", e.getMessage());
        }
    }

}
