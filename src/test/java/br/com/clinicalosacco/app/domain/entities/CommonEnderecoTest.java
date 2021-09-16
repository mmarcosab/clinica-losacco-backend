package br.com.clinicalosacco.app.domain.entities;


import br.com.clinicalosacco.app.domain.entities.impl.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CommonEnderecoTest {

    @Test
    public void testCriarEnderecoComSucesso() throws Exception {
        CommonEndereco e = new CommonEndereco("teste", "233","sao paulo",  "complemento", "teste bairro", "SP");
        assertEquals("teste", e.getRua());
        assertEquals("233", e.getNumero());
        assertEquals("sao paulo", e.getCidade());
        assertEquals("complemento", e.getComplemento());
        assertEquals("teste bairro", e.getBairro());
        assertEquals("SP", e.getUf());
    }

    @Test
    public void testCriarEnderecoComRuaInvalido() {
        try {
            Endereco e = new CommonEndereco("", "233","sao paulo",  "complemento", "teste bairro", "SP");
        } catch (Exception e){
            assertEquals("rua invalida, preencher corretamente", e.getMessage());
        }
    }

    @Test
    public void testCriarEnderecoComRuaNula() {
        try {
            Endereco e = new CommonEndereco(null, "233","sao paulo",  "complemento", "teste bairro", "SP");
        } catch (Exception e){
            assertEquals("rua invalida, preencher corretamente", e.getMessage());
        }
    }

    @Test
    public void testCriarEnderecoComNumeroInvalido(){
        try {
            Endereco e = new CommonEndereco("teste", "","sao paulo",  "complemento", "teste bairro", "SP");
        } catch (Exception e){
            assertEquals("numero invalido, preencher corretamente", e.getMessage());
        }
    }

    @Test
    public void testCriarEnderecoComNumeroNulo(){
        try {
            Endereco e = new CommonEndereco("teste", null,"sao paulo",  "complemento", "teste bairro", "SP");
        } catch (Exception e){
            assertEquals("numero invalido, preencher corretamente", e.getMessage());
        }
    }


    @Test
    public void testCriarEnderecoComCidadeInvalida(){
        try {
            Endereco e = new CommonEndereco("teste", "233","",  "complemento", "teste bairro", "SP");
        } catch (Exception e){
            assertEquals("cidade invalida, preencher corretamente", e.getMessage());
        }
    }

    @Test
    public void testCriarEnderecoComCidadeNula(){
        try {
            Endereco e = new CommonEndereco("teste", "233",null,  "complemento", "teste bairro", "SP");
        } catch (Exception e){
            assertEquals("cidade invalida, preencher corretamente", e.getMessage());
        }
    }

    @Test
    public void testCriarEnderecoComBairroInvalido(){
        try {
            Endereco e = new CommonEndereco("teste", "233","sao paulo",  "complemento", "", "SP");
        } catch (Exception e){
            assertEquals("bairro invalido, preencher corretamente", e.getMessage());
        }
    }

    @Test
    public void testCriarEnderecoComBairroNulo(){
        try {
            Endereco e = new CommonEndereco("teste", "233","sao paulo",  "complemento", null, "SP");
        } catch (Exception e){
            assertEquals("bairro invalido, preencher corretamente", e.getMessage());
        }
    }

    @Test
    public void testCriarEnderecoComUFInvalido(){
        try {
            Endereco e = new CommonEndereco("teste", "233","sao paulo",  "complemento", "bairro teste", "");
        } catch (Exception e){
            assertEquals("uf invalido, preencher corretamente", e.getMessage());
        }
    }

    @Test
    public void testCriarEnderecoComUFNulo(){
        try {
            Endereco e = new CommonEndereco("teste", "233","sao paulo",  "complemento", "bairro teste", null);
        } catch (Exception e){
            assertEquals("uf invalido, preencher corretamente", e.getMessage());
        }
    }


}
