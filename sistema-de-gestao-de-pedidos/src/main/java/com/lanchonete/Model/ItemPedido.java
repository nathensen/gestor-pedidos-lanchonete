package com.lanchonete.model;

public class ItemPedido {

    private Integer idItemPedido;
    private Produto produto;
    private Integer quantidade;
    private Double subtotal;
    
    public ItemPedido(Integer idItemPedido, Produto produto, Integer quantidade, Double subtotal) {
        this.idItemPedido = idItemPedido;
        this.produto = produto;
        this.quantidade = quantidade;
        this.subtotal = subtotal;
    }
    
    public Integer getIdPedido() {
        return idItemPedido;
    }
    public void setId(Integer id) {
        this.idItemPedido = idItemPedido;
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
