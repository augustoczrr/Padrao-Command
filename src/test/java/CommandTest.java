package command;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CommandTest {

    @Test
    void devePrepararPizza() {

        Cozinha cozinha = new Cozinha();

        Command comando =
                new FazerPizzaCommand(cozinha);

        Atendente atendente =
                new Atendente();

        atendente.setComando(comando);

        assertEquals(
                "Pizza preparada",
                atendente.executarComando()
        );
    }

    @Test
    void deveCancelarPedido() {

        Cozinha cozinha = new Cozinha();

        Command comando =
                new CancelarPedidoCommand(cozinha);

        Atendente atendente =
                new Atendente();

        atendente.setComando(comando);

        assertEquals(
                "Pedido cancelado",
                atendente.executarComando()
        );
    }
}
