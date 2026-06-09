package org.example;

package adapter;

public class EntregaAdapter implements Entrega {

    private SistemaEntregaAntigo sistemaAntigo;

    public EntregaAdapter(SistemaEntregaAntigo sistemaAntigo) {
        this.sistemaAntigo = sistemaAntigo;
    }

    @Override
    public String entregarPedido() {
        return sistemaAntigo.enviarPizza();
    }
}
