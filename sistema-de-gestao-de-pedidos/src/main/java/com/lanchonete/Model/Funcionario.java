package com.lanchonete.model;

public class Funcionario {

    private String nome;
    private int id;
    private String funcao;
    
    public Funcionario(String nome, int id, String funcao) {
        this.nome = nome;
        this.id = id;
        this.funcao = funcao;
    }

    public String getNome() { 
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getFuncao() {
        return funcao;
    }
    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

}
