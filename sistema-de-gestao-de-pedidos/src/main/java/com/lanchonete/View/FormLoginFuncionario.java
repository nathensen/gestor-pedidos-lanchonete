package com.lanchonete.view;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class FormLoginFuncionario extends JFrame {

        public FormLoginFuncionario() {
        super("Login de Funcionario - Lanchonete App");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout(10, 10));
        

        // Configuração do Painel de Cadastro (Norte)
        setupLoginPanel();
        
        // Configuração do Painel de Listagem (Centro)
        setupLoginPanel();

        pack(); // Ajusta o tamanho da janela aos componentes
        setLocationRelativeTo(null); // Centraliza a janela
    }


    private void setupLoginPanel() {
        JPanel panel = new JPanel(new GridLayout(3, 2, 5, 5));

        add(panel, BorderLayout.NORTH);

    }

}