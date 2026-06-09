package org.example;

package adapter;

public class Pedido {

    private Entrega entrega;

    public Pedido(Entrega entrega) {
        this.entrega = entrega;
    }

    public String realizarEntrega() {
        return entrega.entregarPedido();
    }
}
