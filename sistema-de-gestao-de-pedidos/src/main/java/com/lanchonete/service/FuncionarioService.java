package com.lanchonete.service;

import com.lanchonete.model.Funcionario;

public class FuncionarioService {
  /**
     * Cria uma nova instância de Vendedor
     */
    public Funcionario criarFuncionario(String nome, double salario) {
        return new Funcionario(nome, salario);
    }
    
    /**
     * Calcula o valor total a receber (salário + bônus)
     */
    public double calcularTotalReceber(Funcionario funcionario) {
        return funcionario.getSalario() + funcionario.getBonus();
    }
    
    public void mostrarInformacoes(Funcionario funcionario) {
        System.out.println("\n=== Informações do Vendedor ===");
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Salário base: " + FormatadorMoeda.formatar(funcionario.getSalario()));
        System.out.println("Bônus acumulado: " + FormatadorMoeda.formatar(funcionario.getBonus()));
        System.out.println("Total a receber: " + 
        FormatadorMoeda.formatar(funcionario.getSalario() + funcionario.getBonus()));
    }
    
    public void mostrarResumoFinalTurno(Funcionario funcionario) {
        System.out.println("\n======== RESUMO FINAL DO TURNO ========");
        System.out.println("Vendedor: " + funcionario.getNome());
        System.out.println("Salário base: " + FormatadorMoeda.formatar(funcionario.getSalario()));
        System.out.println("Bônus total acumulado: " + FormatadorMoeda.formatar(funcionario.getBonus()));
        System.out.println("Valor total a receber: " + 
                FormatadorMoeda.formatar(funcionario.getSalario() + funcionario.getBonus()));
        System.out.println("=======================================");
    }
}