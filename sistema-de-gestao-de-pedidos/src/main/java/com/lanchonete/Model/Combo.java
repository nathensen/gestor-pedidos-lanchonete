package com.lanchonete.model;

import java.util.List;

public class Combo extends Produto {
    
    private List<Produto> itens;  // Lista de produtos que formam o combo
    private double precoCombo;    // Preço do combo, que pode ser um preço fixo ou calculado

    // Construtor
    public Combo(int id, String nome, String descricao, List<Produto> itens) {
        super(id, nome, descricao, calcularPrecoCombo(itens), "Combo");  // Passa o preço calculado para o produto base
        this.itens = itens;
        this.precoCombo = calcularPrecoCombo(itens);
    }

    // Método para calcular o preço do combo (por exemplo, somando o preço dos itens com desconto)
    private static double calcularPrecoCombo(List<Produto> itens) {
        double total = 0;
        for (Produto item : itens) {
            total += item.getPreco();  // Soma o preço de cada produto do combo
        }
        return total * 0.9;  // Exemplo: desconto de 10% no combo
    }

    // Getter para a lista de itens
    public List<Produto> getItens() {
        return itens;
    }

    // Getter para o preço do combo
    public double getPrecoCombo() {
        return precoCombo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Combo: ").append(getNome()).append("\n");
        sb.append("Descrição: ").append(getDescricao()).append("\n");
        sb.append("Itens do Combo: \n");
        for (Produto item : itens) {
           sb.appen
        };
    }
}   