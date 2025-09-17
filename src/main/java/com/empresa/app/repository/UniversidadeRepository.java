// Local: app/src/main/java/com/empresa/app/repository/UniversidadeRepository.java

package com.empresa.app.repository; // <<< ENDEREÇO CORRIGIDO

import com.empresa.app.model.Universidade; // <<< IMPORT CORRIGIDO
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UniversidadeRepository extends JpaRepository<Universidade, Long> {
    
}