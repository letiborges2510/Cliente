package com.example.cliente.controller;

import com.example.cliente.model.Cliente;
import com.example.cliente.service.ClienteService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cliente") // Define a rota base da API: tudo começa com /cliente

public class ClienteController {
    // Criação de uma variável final do tipo ClienteService
    // Essa classe será responsável pelas regras de negócio
    private final ClienteService service;

    // Injeção de dependência via construtor
    // O Spring automaticamente fornece uma instância de ClienteService
    public ClienteController(ClienteService service) {
        this.service = service;
    }

    @PostMapping
    // salvar um novo cliente
    public Cliente salvar(@RequestBody Cliente cliente) {
        return service.salvar(cliente);
    }

    @GetMapping
    // listar todos os clientes
    public List<Cliente> listar() {
        return service.listar();
    }

    @GetMapping("/{id}")
    // buscar um cliente específico pelo ID
    // @PathVariable pega o valor da URL
    public Cliente buscar(@PathVariable String id) {
        return service.buscar(id);
    }

    @PutMapping("/{id}")
    // atualizar um cliente existente
    public Cliente atualizar(@PathVariable String id, @RequestBody Cliente cliente) {
        return service.atualizar(id, cliente);
    }

    @DeleteMapping("/{id}")    // deletar um cliente pelo ID
    public void deletar(@PathVariable String id) {
        service.deletar(id);
    }

}
