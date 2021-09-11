package br.com.clinicalosacco.app.adapters.database.repository;

import br.com.clinicalosacco.app.adapters.database.entities.ExameData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExameRepository extends JpaRepository<ExameData, Integer> {
    
}
