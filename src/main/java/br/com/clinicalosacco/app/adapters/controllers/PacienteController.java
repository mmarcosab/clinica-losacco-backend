package br.com.clinicalosacco.app.adapters.controllers;


import br.com.clinicalosacco.app.adapters.controllers.request.MedicoRequest;
import br.com.clinicalosacco.app.adapters.controllers.request.PacienteRequest;
import br.com.clinicalosacco.app.domain.usecases.MedicoService;
import br.com.clinicalosacco.app.domain.usecases.PacienteService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pacientes")
@RequiredArgsConstructor
public class PacienteController {

    private final PacienteService service;

    @GetMapping
    public ResponseEntity<?> list(){
        return ResponseEntity.ok(service.listar());
    }

    @PostMapping
    public ResponseEntity<?> create(@RequestBody PacienteRequest request){
        return ResponseEntity.status(HttpStatus.CREATED).body(service.criar(request));
    }

    @PutMapping
    public ResponseEntity<?> update(@PathVariable Integer id, @RequestBody PacienteRequest request){
        return ResponseEntity.ok(service.atualizar(id, request));
    }

    @DeleteMapping
    public ResponseEntity<?> delete(@PathVariable Integer id){
        return ResponseEntity.ok(service.deletar(id));
    }

    @GetMapping
    public ResponseEntity<?> findById(@PathVariable Integer id){
        return ResponseEntity.ok(service.buscarPorId(id));
    }

    @GetMapping
    public ResponseEntity<?> findByName(@PathVariable String nome){
        return ResponseEntity.ok(service.buscarPorNome(nome));
    }

}
