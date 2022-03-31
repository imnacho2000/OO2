/**
 * 
 */
package ar.edu.unlp.info.oo2.Ejercicio1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TopografiaTest {
	
	TopografiaMixta topoMixta;
	Agua agua;
	Tierra tierra;
	
	@BeforeEach
	void setUp() throws Exception {
		agua = new Agua();
		tierra = new Tierra();
		topoMixta = new TopografiaMixta(agua,tierra,agua,tierra);
	}
    @Test
    public void testAguayTierra() {
        assertEquals(true,agua.equals(new Agua()));
        assertEquals(false,agua.equals(new Tierra()));
        assertEquals(true,tierra.equals(new Tierra()));
        assertEquals(false,tierra.equals(new Agua()));
    }
    
    @Test
    public void testTopografiaMixta() {
    	TopografiaMixta topo = new TopografiaMixta(agua,tierra,agua,tierra);
        assertEquals(true,topo.equals(topoMixta));
        assertEquals(false,topo.equals(new Agua()));
        assertEquals(false,topo.equals(new TopografiaMixta(tierra,agua,tierra,agua)));
        assertEquals(false,topo.equals(new TopografiaMixta(tierra,agua,tierra,topoMixta)));
    }
    
}
