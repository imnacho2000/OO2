/**
 * 
 */
package ar.edu.unlp.info.oo2.Ejercicio3;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ProyectoTest {
	
	Emprendedor james;
	Persona guido;
	Proyecto proyecto;
	
	@BeforeEach
	void setUp() throws Exception {
		
		james = new Emprendedor("James");
		james.crearProyecto("Vacaciones Kathmandu 2023", 5000);
		proyecto = james.getProyecto("Vacaciones Kathmandu 2023");
		guido = new Persona("guido");
		
	}
	
    @Test
    public void testProyecto() {
    	assertEquals("Publicado",james.getProyecto("Vacaciones Kathmandu 2023").getEstado());
    	
    	guido.invertirDinero(proyecto, 5000);
    	proyecto.aniadirPersonaInvertida(guido);
    	assertEquals(5000,james.getProyecto("Vacaciones Kathmandu 2023").consultarMontoTotalRecibido());
    	
    	guido.invertirDinero(proyecto, 5000);
    	assertEquals(10000,james.getProyecto("Vacaciones Kathmandu 2023").consultarMontoTotalRecibido());
    	assertEquals("Conformado",james.getProyecto("Vacaciones Kathmandu 2023").getEstado());
    	
    	Exception e = assertThrows(RuntimeException.class,() -> james.getProyecto("Vacaciones Kathmandu 2023").Cancelar());
    	assertEquals("El Proyecto se encuentra conformado no se puede cancelar.",e.getMessage());
    
    	guido.invertirDinero(proyecto, 5000);
    	assertEquals(15000,james.getProyecto("Vacaciones Kathmandu 2023").consultarMontoTotalRecibido());
    	
    	e = assertThrows(RuntimeException.class,() -> james.getProyecto("Vacaciones Kathmandu 2023").publicar());
    	assertEquals("El Proyecto se encuentra" + james.getProyecto("Vacaciones Kathmandu 2023").getEstado() + " no se puede publicar.",e.getMessage());
    	
    	assertEquals("guido",proyecto.getPersonaInvirtio("guido").getNombre());
    	assertNull(proyecto.getPersonaInvirtio("guidoo"));
    }
   
    
    @Test
    public void testCancelar() {
    	assertEquals("Publicado",james.getProyecto("Vacaciones Kathmandu 2023").getEstado());
    	guido.invertirDinero(proyecto, 500);
    	assertEquals(500,james.getProyecto("Vacaciones Kathmandu 2023").consultarMontoTotalRecibido());
    	
    	james.getProyecto("Vacaciones Kathmandu 2023").Cancelar();
    	assertEquals("Cancelado",james.getProyecto("Vacaciones Kathmandu 2023").getEstado());
    	Exception e = assertThrows(RuntimeException.class,() -> guido.invertirDinero(proyecto, 500));
    	assertEquals("El Proyecto se encuentra cancelado no se puede invertir.",e.getMessage());
    	
    }
    
}
