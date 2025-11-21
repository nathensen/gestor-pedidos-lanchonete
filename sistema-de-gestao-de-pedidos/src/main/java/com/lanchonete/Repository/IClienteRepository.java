package com.lanchonete.Repository;

import java.util.List;

import com.lanchonete.model.Cliente;

public class IClienteRepository implements ClienteRepository {

        private final Cliente cliente = new Cliente(null, 0, null);

    @Override
    public void salvar(Cliente cliente) {
        cliente.inserir(cliente); 
    }

    @Override
    public List<Cliente> buscarTodos() {
        return cliente.buscarTodos(); 
    }

    @Override
    public Cliente buscarPorId(int id) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
