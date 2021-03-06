/**
 * 
 */
package ar.edu.unlp.info.oo2.Ejercicio2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TopografiaTest {
	
	TopografiaMixta topoMixta;
	Agua agua;
	Tierra tierra;
	Pantano pantano;
	
	@BeforeEach
	void setUp() throws Exception {
		agua = new Agua();
		tierra = new Tierra();
		pantano = new Pantano();
		topoMixta = new TopografiaMixta(agua,tierra,agua,tierra);
	}
    @Test
    public void testAguayTierra() {
        assertEquals(true,agua.comparar(new Agua()));
        assertEquals(false,agua.comparar(new Tierra()));
        assertEquals(true,tierra.comparar(new Tierra()));
        assertEquals(false,tierra.comparar(new Agua()));
    }
    
    @Test
    public void testTopografiaMixta() {
    	TopografiaMixta topo = new TopografiaMixta(agua,tierra,agua,tierra);
        assertEquals(true,topo.comparar(topoMixta));
        assertEquals(false,topo.comparar(new TopografiaMixta(tierra,agua,tierra,agua)));
        assertEquals(false,topo.comparar(new TopografiaMixta(tierra,agua,tierra,topoMixta)));
    }
    
    @Test
    public void testPantano() {
	    assertEquals(0.7,pantano.calcularProporcion());
	    assertEquals(false,pantano.comparar(agua));
	    assertEquals(false,pantano.comparar(tierra));
	    assertEquals(true,pantano.comparar(new Pantano()));
    }
    
}
