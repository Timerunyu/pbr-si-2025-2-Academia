// Local: app/src/main/java/com/empresa/app/controller/UniversidadeController.java

package com.empresa.app.controller; // <<< ENDEREÇO CORRIGIDO

import com.empresa.app.model.Universidade; // <<< IMPORT CORRIGIDO
import com.empresa.app.service.UniversidadeService; // <<< IMPORT CORRIGIDO
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/universidades")
public class UniversidadeController {

    @Autowired
    private UniversidadeService universidadeService;

    @PostMapping
    public ResponseEntity<Universidade> criarUniversidade(@RequestBody Universidade universidade) {
        Universidade novaUniversidade = universidadeService.salvar(universidade);
        return new ResponseEntity<>(novaUniversidade, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Universidade>> buscarTodasUniversidades() {
        List<Universidade> universidades = universidadeService.buscarTodas();
        return new ResponseEntity<>(universidades, HttpStatus.OK);
    }
}