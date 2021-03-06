/**
 * 
 */
package ar.edu.unlp.info.oo2.Ejercicio2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PedidoTest {
	
	Cliente	nacho;
	Pedido sillaGamer;
	
	@BeforeEach
	void setUp() throws Exception {
		nacho = new Cliente("Ignacio", "Carrera","1122","ignaciocarrera2000@hotmail.com");
		sillaGamer = new Pedido(223, nacho);
	}
	
    @Test
    public void testDebito() {
    	assertEquals(true,sillaGamer.pagarConMedio(new DebitoGatewayAdapter(new DebitoGateway())));
    	DebitoGateway debito = new DebitoGateway();
    	debito.addError("hola");
    	assertEquals(false,sillaGamer.pagarConMedio(new DebitoGatewayAdapter(debito)));
    	
    }
    
    @Test
    public void testMail() {
    	assertEquals(true,sillaGamer.pagarConMedio(new DineroMailGatewayAdapter(new DineroMailGateway())));
    }
}
