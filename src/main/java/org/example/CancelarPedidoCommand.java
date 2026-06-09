package org.example;

package command;

public class CancelarPedidoCommand implements Command {

    private Cozinha cozinha;

    public CancelarPedidoCommand(Cozinha cozinha) {
        this.cozinha = cozinha;
    }

    @Override
    public String executar() {
        return cozinha.cancelarPedido();
    }
}
