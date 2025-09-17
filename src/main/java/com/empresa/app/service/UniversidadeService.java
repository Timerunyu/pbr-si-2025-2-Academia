// Local: app/src/main/java/com/empresa/app/service/UniversidadeService.java

package com.empresa.app.service; // <<< ENDEREÇO CORRIGIDO

import com.empresa.app.model.Universidade; // <<< IMPORT CORRIGIDO
import com.empresa.app.repository.UniversidadeRepository; // <<< IMPORT CORRIGIDO
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UniversidadeService {

    @Autowired
    private UniversidadeRepository universidadeRepository;

    public Universidade salvar(Universidade universidade) {
        return universidadeRepository.save(universidade);
    }

    public List<Universidade> buscarTodas() {
        return universidadeRepository.findAll();
    }
}