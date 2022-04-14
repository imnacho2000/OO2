/**
 * 
 */
package ar.edu.unlp.info.oo2.Ejercicio3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class DispositivoTest {
	
	Dispositivo device;
	
	@BeforeEach
	void setUp() throws Exception {
		device = new Dispositivo("Nacho");
	}
	
    @Test
    public void testSend() {
    	device.setConnection(new CuatroGAdapter());
        assertEquals("4G Connection", device.getEstado());
        device.setCalculator(new CRC16_Calculator());
        assertEquals("Utilizando 4G Connection enviando: Nacho",device.send("Nacho"));
        device.setCalculator(new CRC32_Calculator());
        assertEquals("Utilizando 4G Connection enviando: Nacho",device.send("Nacho"));
        device.setConnection(new WifiConn());
        assertEquals("Wi Fi connection",device.getEstado());
        assertEquals("Utilizando Wi Fi connection enviando: pedro",device.send("pedro"));
    }
}
