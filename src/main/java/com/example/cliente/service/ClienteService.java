package com.example.cliente.service;

import com.example.cliente.model.Cliente;
import org.springframework.stereotype.Service;
import com.example.cliente.repository.ClienteRepository;;

import java.util.List;

@Service
public class ClienteService {

    private final ClienteRepository repository;
    public ClienteService(ClienteRepository repository) {
        this.repository = repository;
    }

    public Cliente salvar(Cliente cliente) {
        return repository.save(cliente);
    }
    public Cliente atualizar(String id, Cliente clienteatualizado) {
        Cliente cliente = buscar(id);
        cliente.setNome(clienteatualizado.getNome());
        cliente.setDataNascimento(clienteatualizado.getDataNascimento());
        cliente.setEndereco(clienteatualizado.getEndereco());

        return repository.save(cliente);
    }
    public void deletar(String id) {
        repository.deleteById(id);
    }

    public List<Cliente> listar() {
      return repository.findAll();
    }

    public Cliente buscar(String id) {
        return repository.findById(id)
                .orElseThrow(()-> new RuntimeException("Cliente não encontrado"));
    }
}
