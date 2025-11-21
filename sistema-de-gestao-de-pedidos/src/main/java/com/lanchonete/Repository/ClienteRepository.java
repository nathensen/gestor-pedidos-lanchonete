package com.lanchonete.Repository;

import java.util.List;

import com.lanchonete.model.Cliente;

public interface ClienteRepository {
    void salvar(Cliente cliente);
    List<Cliente> buscarTodos();
    Cliente buscarPorId (int id); //obs: vai retornar motorista, listar por id: método para fazer update
}