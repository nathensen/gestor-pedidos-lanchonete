package com.lanchonete.model;

public class Funcionario {

    private String nome;
    private int idFuncionario;
    private String funcao;
    
    public Funcionario(String nome, int id, String funcao) {
        this.nome = nome;
        this.idFuncionario = idFuncionario;
        this.funcao = funcao;
    }

    public String getNome() { 
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdFuncionario() {
        return idFuncionario;
    }
    public void setId(int id) {
        this.idFuncionario = idFuncionario;
    }
    public String getFuncao() {
        return funcao;
    }
    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

}
