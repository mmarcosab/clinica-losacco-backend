package br.com.clinicalosacco.app.adapters.controllers;

import br.com.clinicalosacco.app.adapters.controllers.request.SecretariaRequest;
import br.com.clinicalosacco.app.domain.usecases.SecretariaService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/secretarias")
@RequiredArgsConstructor
public class SecretariaController {

    private final SecretariaService service;

    @GetMapping
    public ResponseEntity<?> list(){
        return ResponseEntity.ok(service.listar());
    }

    @PostMapping
    public ResponseEntity<?> create(@RequestBody SecretariaRequest request){
        return ResponseEntity.status(HttpStatus.CREATED).body(service.criar(request));
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable Integer id, @RequestBody SecretariaRequest request){
        return ResponseEntity.ok(service.atualizar(id, request));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable Integer id){
        return ResponseEntity.ok(service.deletar(id));
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> findById(@PathVariable Integer id){
        return ResponseEntity.ok(service.buscarPorId(id));
    }

    @GetMapping("/{nome}")
    public ResponseEntity<?> findByName(@PathVariable String nome){
        return ResponseEntity.ok(service.buscarPorNome(nome));
    }

}
