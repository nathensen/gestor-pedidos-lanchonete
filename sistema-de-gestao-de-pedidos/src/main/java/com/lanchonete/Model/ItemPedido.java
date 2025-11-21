package com.lanchonete.model;

public class ItemPedido {

    private Integer idPedido;
    private Produto produto;
    private Integer quantidade;
    private Double subtotal;
    
    public ItemPedido(Integer idPedido, Produto produto, Integer quantidade, Double subtotal) {
        this.idPedido = idPedido;
        this.produto = produto;
        this.quantidade = quantidade;
        this.subtotal = subtotal;
    }
    
    public Integer getIdPedido() {
        return idPedido;
    }
    public void setId(Integer id) {
        this.idPedido = idPedido;
    }
    public Produto getProduto() {
        return produto;
    }
    public void setProduto(Produto produto) {
        this.produto = produto;
    }
    public Integer getQuantidade() {
        return quantidade;
    }
    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }
    public Double getSubtotal() {
        return subtotal;
    }
    public void setSubtotal(Double subtotal) {
        this.subtotal = subtotal;
    }
}
