/**
 * 
 */
package ar.edu.unlp.info.oo2.Ejercicio1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LavarropasTest {
	
	Lavarropas lavarropas;
	
	@BeforeEach
	void setUp() throws Exception {
		lavarropas = new Lavarropas();
	}
	
    @Test
    public void testLavadoDiario() {
    	System.out.println("Iniciando lavado diario: ");
    	lavarropas.setTipoLavado(new LavadoDiario());
    	assertEquals(30,lavarropas.hacer());
    }
    
    @Test
    public void testRopaDelicada() {
    	System.out.println("Iniciando Ropa delicada: ");
    	lavarropas.setTipoLavado(new RopaDelicada());
    	assertEquals(55,lavarropas.hacer());
    }
    
    @Test
    public void testRopaMuySucia() {  	
    	System.out.println("Iniciando Ropa muy sucia: ");
    	lavarropas.setTipoLavado(new RopaMuySucia());
    	assertEquals(55,lavarropas.hacer());
    }
    
}
