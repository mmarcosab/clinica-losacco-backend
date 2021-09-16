package br.com.clinicalosacco.app.domain.entities;

import br.com.clinicalosacco.app.domain.entities.impl.*;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class CommonPacienteTest {

    @Test
    public void testCriarPacienteComSucesso() throws Exception {
        CommonEndereco e = new CommonEndereco("teste", "233","sao paulo",  "complemento", "teste bairro", "SP");
        CommonPlanoSaude p = new CommonPlanoSaude("Tipo 1", "12345667897874542154", "Plano A", "Enfermagem");
        CommonPaciente paciente = new CommonPaciente("Jose", "12345678941", "12345678", LocalDate.now(), e, p, null);
        assertEquals("Jose", paciente.getNome());
        assertEquals("12345678941", paciente.getCpf());
        assertEquals("12345678", paciente.getRg());
        assertEquals(LocalDate.now(), paciente.getDataNascimento());
        assertEquals(e, paciente.getEndereco());
        assertEquals(p, paciente.getPlanoSaude());
        assertEquals(null, paciente.getHistorico());
    }

    @Test
    public void testCriarPacienteComNomeInvalido(){
        try {
            CommonEndereco e = new CommonEndereco("teste", "233","sao paulo",  "complemento", "teste bairro", "SP");
            CommonPlanoSaude p = new CommonPlanoSaude("Tipo 1", "12345667897874542154", "Plano A", "Enfermagem");
            CommonPaciente paciente = new CommonPaciente("", "12345678941", "12345678", LocalDate.now(), e, p, null);
        } catch(Exception e){
            assertEquals("nome invalido, preencher corretamente", e.getMessage());
        }
    }

    @Test
    public void testCriarPacienteComCpfNulo(){
        try {
            CommonEndereco e = new CommonEndereco("teste", "233","sao paulo",  "complemento", "teste bairro", "SP");
            CommonPlanoSaude p = new CommonPlanoSaude("Tipo 1", "12345667897874542154", "Plano A", "Enfermagem");
            CommonPaciente paciente = new CommonPaciente("Jose", null, "12345678", LocalDate.now(), e, p, null);
        } catch(Exception e){
            assertEquals("cpf invalido, preencher corretamente", e.getMessage());
        }
    }

    @Test
    public void testCriarPacienteComCpfInvalido(){
        try {
            CommonEndereco e = new CommonEndereco("teste", "233","sao paulo",  "complemento", "teste bairro", "SP");
            CommonPlanoSaude p = new CommonPlanoSaude("Tipo 1", "12345667897874542154", "Plano A", "Enfermagem");
            CommonPaciente paciente = new CommonPaciente("Jose", "", "12345678", LocalDate.now(), e, p, null);
        } catch(Exception e){
            assertEquals("cpf invalido, preencher corretamente", e.getMessage());
        }
    }

    @Test
    public void testCriarPacienteComRgNulo(){
        try {
            CommonEndereco e = new CommonEndereco("teste", "233","sao paulo",  "complemento", "teste bairro", "SP");
            CommonPlanoSaude p = new CommonPlanoSaude("Tipo 1", "12345667897874542154", "Plano A", "Enfermagem");
            CommonPaciente paciente = new CommonPaciente("Jose", "12345678974", null, LocalDate.now(), e, p, null);
        } catch(Exception e){
            assertEquals("rg invalido, preencher corretamente", e.getMessage());
        }
    }

    @Test
    public void testCriarPacienteComRgInvalido(){
        try {
            CommonEndereco e = new CommonEndereco("teste", "233","sao paulo",  "complemento", "teste bairro", "SP");
            CommonPlanoSaude p = new CommonPlanoSaude("Tipo 1", "12345667897874542154", "Plano A", "Enfermagem");
            CommonPaciente paciente = new CommonPaciente("Jose", "12345678987", "", LocalDate.now(), e, p, null);
        } catch(Exception e){
            assertEquals("rg invalido, preencher corretamente", e.getMessage());
        }
    }

    @Test
    public void testCriarPacienteComDataNascimentoNula(){
        try {
            CommonEndereco e = new CommonEndereco("teste", "233","sao paulo",  "complemento", "teste bairro", "SP");
            CommonPlanoSaude p = new CommonPlanoSaude("Tipo 1", "12345667897874542154", "Plano A", "Enfermagem");
            CommonPaciente paciente = new CommonPaciente("Jose", "12345678974", "123456789", null, e, p, null);
        } catch(Exception e){
            assertEquals("data de nascimento invalida, preencher corretamente", e.getMessage());
        }
    }

    @Test
    public void testCriarPacienteComEnderecoNulo(){
        try {
            CommonPlanoSaude p = new CommonPlanoSaude("Tipo 1", "12345667897874542154", "Plano A", "Enfermagem");
            CommonPaciente paciente = new CommonPaciente("Jose", "12345678974", "123456789", LocalDate.now(), null, p, null);
        } catch(Exception e){
            assertEquals("endereco invalido, preencher corretamente", e.getMessage());
        }
    }

    @Test
    public void testCriarPacienteComPlanoSaudeNulo(){
        try {
            CommonEndereco e = new CommonEndereco("teste", "233","sao paulo",  "complemento", "teste bairro", "SP");
            CommonPaciente paciente = new CommonPaciente("Jose", "12345678974", "123456789", LocalDate.now(), e, null, null);
        } catch(Exception e){
            assertEquals("plano de saude invalido, preencher corretamente", e.getMessage());
        }
    }

}
