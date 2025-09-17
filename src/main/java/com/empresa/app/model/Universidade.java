// Local: app/src/main/java/com/empresa/app/model/Universidade.java

package com.empresa.app.model; // <<< ENDEREÇO CORRIGIDO

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "universidades")
@Data
public class Universidade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true, length = 10)
    private String sigla;

    @Column(nullable = false)
    private String nome;

    @Column(nullable = false, unique = true, length = 18)
    private String cnpj;

    @Column
    private String telefone;
}