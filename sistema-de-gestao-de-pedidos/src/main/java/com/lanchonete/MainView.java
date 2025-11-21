package com.lanchonete;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MainView extends Application {
    @Override
    public void start(Stage stage) {
        // Criação do botão para emitir o cupom
        Button emitirCupomButton = new Button("Emitir Cupom Fiscal");

        // Ação do botão
        emitirCupomButton.setOnAction(e -> emitirCupomFiscal());

        // Layout
        Scene scene = new Scene(emitirCupomButton, 200, 100);
        stage.setTitle("Sistema de Lanchonete");
        stage.setScene(scene);
        stage.show();
    }

    // Método para emitir o cupom fiscal
    public void emitirCupomFiscal() {
        // A lógica de emissão do cupom pode ser chamada aqui
        System.out.println("Emitindo o cupom fiscal...");
    }

    public static void main(String[] args) {
        launch(args);
    }
}
