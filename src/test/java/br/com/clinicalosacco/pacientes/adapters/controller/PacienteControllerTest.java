package br.com.clinicalosacco.pacientes.adapters.controller;


import br.com.clinicalosacco.pacientes.adapters.controller.request.EnderecoRequestModel;
import br.com.clinicalosacco.pacientes.adapters.controller.request.PacienteRequestModel;
import br.com.clinicalosacco.pacientes.adapters.controller.request.PlanoSaudeRequestModel;
import br.com.clinicalosacco.pacientes.adapters.controller.response.EnderecoResponseModel;
import br.com.clinicalosacco.pacientes.adapters.controller.response.PacienteResponseModel;
import br.com.clinicalosacco.pacientes.adapters.controller.response.PlanoSaudeResponseModel;
import br.com.clinicalosacco.pacientes.domain.usecase.impl.CreatePacienteUseCaseImpl;
import br.com.clinicalosacco.pacientes.domain.usecase.impl.DeletePacienteUseCaseImpl;
import br.com.clinicalosacco.pacientes.domain.usecase.impl.FindPacienteUseCaseImpl;
import br.com.clinicalosacco.pacientes.domain.usecase.impl.UpdatePacienteUseCaseImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import static org.mockito.Mockito.*;



public class PacienteControllerTest {

    private PacienteController pacienteController;
    private CreatePacienteUseCaseImpl createUseCase;
    private FindPacienteUseCaseImpl findUseCase;
    private DeletePacienteUseCaseImpl deleteUseCase;
    private UpdatePacienteUseCaseImpl updateUseCase;


    @BeforeEach
    public void init(){
        createUseCase = mock(CreatePacienteUseCaseImpl.class);
        findUseCase = mock(FindPacienteUseCaseImpl.class);
        deleteUseCase = mock(DeletePacienteUseCaseImpl.class);
        updateUseCase = mock(UpdatePacienteUseCaseImpl.class);
        pacienteController = new PacienteController(createUseCase, findUseCase, deleteUseCase, updateUseCase);
    }

    @Test
    public void criarPacienteComSucesso(){
        when(createUseCase.create(any())).thenReturn(createPacienteResponseModel());
        var response = pacienteController.create(createPacienteRequestModel());
        Assertions.assertEquals(HttpStatus.OK, response.getStatusCode());
    }

    @Test
    public void criarPacienteComFalha(){
        when(createUseCase.create(any())).thenThrow(new RuntimeException("Houve um erro ao processar"));
        var response = pacienteController.create(createPacienteRequestModel());
        Assertions.assertEquals(HttpStatus.INTERNAL_SERVER_ERROR, response.getStatusCode());
    }

    @Test
    public void getAllComSucesso() {
        List<PacienteResponseModel> list = new ArrayList<>();
        list.add(createPacienteResponseModel());
        when(findUseCase.findAll()).thenReturn(list);
        var response = pacienteController.findAll();
        Assertions.assertEquals(HttpStatus.OK, response.getStatusCode());

    }

    @Test
    public void getAllComFalha() {
        List<PacienteResponseModel> list = new ArrayList<>();
        list.add(createPacienteResponseModel());
        when(findUseCase.findAll()).thenThrow(new RuntimeException("houve um erro aqui"));
        var response = pacienteController.findAll();
        Assertions.assertEquals(HttpStatus.INTERNAL_SERVER_ERROR, response.getStatusCode());
    }

    @Test
    public void updateComSucesso() {
        when(updateUseCase.update(any(), anyString())).thenReturn(createPacienteResponseModel());
        var response = pacienteController.update(createPacienteRequestModel(), "18yjk1h1kjhiy1");
        Assertions.assertEquals(HttpStatus.OK, response.getStatusCode());
    }

    private PacienteRequestModel createPacienteRequestModel(){
        return PacienteRequestModel.builder()
                .nome("teste")
                .cpf("12345678987")
                .dataNascimento(new Date())
                .email("teste@teste.com.br")
                .telefone("1234569874")
                .endereco(EnderecoRequestModel.builder()
                        .rua("Rua teste")
                        .numero(10)
                        .cep("12345678")
                        .cidade("Sao Paulo")
                        .complemento("")
                        .UF("SP")
                        .pais("Brasil")
                        .build())
                .planoSaude(PlanoSaudeRequestModel.builder()
                        .numeroRegistro("12547854785474558")
                        .tipo("Tipo 1")
                        .build())
                .build();
    }

    private PacienteResponseModel createPacienteResponseModel(){
        return PacienteResponseModel.builder()
                .id("lsjkhiu6433ryhiwefh7856")
                .nome("teste")
                .cpf("12345678987")
                .dataNascimento(new Date())
                .email("teste@teste.com.br")
                .telefone("1234569874")
                .endereco(EnderecoResponseModel.builder()
                        .rua("Rua teste")
                        .numero(10)
                        .cep("12345678")
                        .cidade("Sao Paulo")
                        .complemento("")
                        .UF("SP")
                        .pais("Brasil")
                        .build())
                .planoSaude(PlanoSaudeResponseModel.builder()
                        .numeroRegistro("12547854785474558")
                        .tipo("Tipo 1")
                        .build())
                .build();
    }

}
