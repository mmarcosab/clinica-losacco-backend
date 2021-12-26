package br.com.clinicalosacco.pacientes.adapters.database.repository;

import br.com.clinicalosacco.pacientes.adapters.database.mapper.PacienteDataMapper;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PacienteRepository extends MongoRepository<PacienteDataMapper, String> {
    boolean existsByNome(String nome);
}
