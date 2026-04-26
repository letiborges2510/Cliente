package com.example.domain.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Data
@Document(collection = "cliente")
public class Cliente {
    @Id
    private String id;
    private String nome;
    private LocalDate dataNascimento;
    private Endereco endereco;

}
