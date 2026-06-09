package org.example;

package command;

public class FazerPizzaCommand implements Command {

    private Cozinha cozinha;

    public FazerPizzaCommand(Cozinha cozinha) {
        this.cozinha = cozinha;
    }

    @Override
    public String executar() {
        return cozinha.fazerPizza();
    }
}