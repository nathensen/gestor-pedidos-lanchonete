package com.lanchonete.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Pedido {
    
    private Integer idPedido;
    private Cliente cliente;
    private List<ItemPedido> itens = new ArrayList<>();
    private StatusPedido status;
    private LocalDateTime dataHora;

    public Pedido() {
        this.status = StatusPedido.EM_PRODUCAO;
        this.dataHora = LocalDateTime.now();
    }

    public Pedido(Integer idPedido, Cliente cliente) {
        this();
        this.idPedido = idPedido;
        this.cliente = cliente;
    }

    public void adicionarItem(ItemPedido item) {
        itens.add(item);
    }

    public Double calcularTotal() {
        return itens.stream().mapToDouble(i -> i.getSubtotal()).sum();
    }

    public Integer getId() {
        return idPedido;
    }

    public void setId(Integer idPedido) {
        this.idPedido = idPedido;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<ItemPedido> getItens() {
        return itens;
    }

    public void setItens(List<ItemPedido> itens) {
        this.itens = itens;
    }

    public StatusPedido getStatus() {
        return status;
    }

    public void setStatus(StatusPedido status) {
        this.status = status;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }
}
