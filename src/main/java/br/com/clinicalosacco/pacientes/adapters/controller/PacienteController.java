package br.com.clinicalosacco.pacientes.adapters.controller;

import br.com.clinicalosacco.pacientes.adapters.controller.request.PacienteRequestModel;
import br.com.clinicalosacco.pacientes.domain.usecase.CreateUseCase;
import br.com.clinicalosacco.pacientes.domain.usecase.DeleteUseCase;
import br.com.clinicalosacco.pacientes.domain.usecase.FindUseCase;
import br.com.clinicalosacco.pacientes.domain.usecase.UpdateUseCase;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@Slf4j
@RestController
@RequestMapping("/pacientes")
@RequiredArgsConstructor
public class PacienteController {

    private final CreateUseCase createUseCase;
    private final FindUseCase findUseCase;
    private final DeleteUseCase deleteUseCase;
    private final UpdateUseCase updateUseCase;

    @ApiOperation("Cria um paciente dentro do ambiente da clinica")
    @PostMapping
    public ResponseEntity create(@RequestBody PacienteRequestModel pacienteRequestModel){
        try{
            log.info("Requisicao recebida: {}", pacienteRequestModel);
            return ResponseEntity.ok().body(createUseCase.create(pacienteRequestModel));
        } catch (Exception e){
            log.error("Houve um erro ao processar a requisicao: {}", e.getMessage());
            return new ResponseEntity(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @ApiOperation("Obtem uma lista com todos os registros de pacientes")
    @GetMapping
    public ResponseEntity findAll(){
        try{
            return ResponseEntity.ok().body(findUseCase.findAll());
        } catch (Exception e){
            log.error("Houve um erro ao processar a requisicao: {}", e.getMessage());
            return new ResponseEntity(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @ApiOperation("Obtem um paciente pesquisado pelo nome completo")
    @GetMapping("/{nome}")
    public ResponseEntity findByName(@PathVariable String nome){
        try{
            return ResponseEntity.ok().body(findUseCase.findByName(nome));
        } catch (Exception e){
            log.error("Houve um erro ao processar a requisicao: {}", e.getMessage());
            return new ResponseEntity(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @ApiOperation("Obtem um paciente pesquisado pelo id")
    @GetMapping("/{id}")
    public ResponseEntity findById(@PathVariable String id){
        try{
            return ResponseEntity.ok().body(findUseCase.findById(id));
        } catch (Exception e){
            log.error("Houve um erro ao processar a requisicao: {}", e.getMessage());
            return new ResponseEntity(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @ApiOperation("Atualiza os dados de um paciente")
    @PutMapping("/{id}")
    public ResponseEntity update(@RequestBody PacienteRequestModel pacienteRequestModel, @PathVariable String id) {
        return ResponseEntity.ok().body(updateUseCase.update(pacienteRequestModel, id));
    }

    @ApiOperation("Deleta um paciente do banco de dados usando seu id")
    @DeleteMapping("/{id}")
    public ResponseEntity delete(@PathVariable String id){
        try{
            deleteUseCase.delete(id);
            return ResponseEntity.ok().build();
        } catch (Exception e){
            log.error("Houve um erro ao processar a requisicao: {}", e.getMessage());
            return new ResponseEntity(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
