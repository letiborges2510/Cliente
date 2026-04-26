package com.example.cliente.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Data
@Document(collection = "cliente") // Define o nome da coleção no banco MongoDB como "cliente"
public class Cliente {
    @Id
    private String id;
    private String nome;
    private LocalDate dataNascimento;
    private Endereco endereco;

}
