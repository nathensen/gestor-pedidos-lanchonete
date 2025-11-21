package com.lanchonete.Model;

public class CupomFiscal {

    public static void emitirCupom(Pedido pedido) {
        // Criando uma string para representar o cupom
        StringBuilder cupom = new StringBuilder();
        cupom.append("----- Cúpom Fiscal -----\n");
        cupom.append("Cliente: ").append(pedido.getCliente().getNome()).append("\n");
        cupom.append("Itens:\n");

        // Adicionando os itens do pedido
        for (Produto item : pedido.getItens()) {
            cupom.append(" - ").append(item.getNome())
                 .append(" | Preço: R$ ").append(item.getPreco()).append("\n");
        }

        // Exibindo o total do pedido
        cupom.append("Total: R$ ").append(pedido.calcularTotal()).append("\n");
        cupom.append("Obrigado pela preferência!\n");
        cupom.append("------------------------\n");

        // Emiti o cupom no console (ou você pode gerar um arquivo ou PDF)
        System.out.println(cupom.toString());
    }
}
