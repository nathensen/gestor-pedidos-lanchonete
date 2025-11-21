package com.lanchonete.controller;

import com.lanchonete.model.Pedido;
import com.lanchonete.model.CupomFiscal;

public class PedidoController {
    
    public void emitirCupomFiscal(Pedido pedido) {
        // Chama a lógica que gera o cupom fiscal
        CupomFiscal.emitirCupom(pedido);
    }
}
