package com.lanchonete;

import javax.swing.SwingUtilities;

import com.lanchonete.view.FormLoginFuncionario;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            FormLoginFuncionario view = new FormLoginFuncionario();
            view.setVisible(true);
        });
    }
}