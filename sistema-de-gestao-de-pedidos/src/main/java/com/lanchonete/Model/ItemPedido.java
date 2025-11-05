package com.lanchonete.model;

public class ItemPedido {

    private Integer id;
    private Produto produto;
    private Integer quantidade;
    private Double subtotal;
    
    public ItemPedido(Integer id, Produto produto, Integer quantidade, Double subtotal) {
        this.id = id;
        this.produto = produto;
        this.quantidade = quantidade;
        this.subtotal = subtotal;
    }
    
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
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
