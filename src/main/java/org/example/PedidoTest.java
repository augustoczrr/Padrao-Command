package org.example;

package adapter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PedidoTest {

    @Test
    void deveRealizarEntregaComAdapter() {

        SistemaEntregaAntigo sistemaAntigo =
                new SistemaEntregaAntigo();

        Entrega entrega =
                new EntregaAdapter(sistemaAntigo);

        Pedido pedido =
                new Pedido(entrega);

        assertEquals(
                "Pizza enviada pelo sistema antigo",
                pedido.realizarEntrega()
        );
    }
}
