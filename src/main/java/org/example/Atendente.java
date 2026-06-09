package org.example;

package command;

public class Atendente {

    private Command comando;

    public void setComando(Command comando) {
        this.comando = comando;
    }

    public String executarComando() {
        return comando.executar();
    }
}