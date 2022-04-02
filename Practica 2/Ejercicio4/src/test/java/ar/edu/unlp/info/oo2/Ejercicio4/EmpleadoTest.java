package ar.edu.unlp.info.oo2.Ejercicio4;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EmpleadoTest {
	Temporario james;
	Pasante guido;
	Planta nacho;
	
	@BeforeEach
	void setUp() throws Exception {
		james = new Temporario(4,true,2);
		guido = new Pasante(3);
		nacho = new Planta(true,5,1);
	}
	
    @Test
    public void testTemporario() {
        assertEquals(26994, james.sueldo());
    }
    
    @Test
    public void testPasante() {
        assertEquals(23100, guido.sueldo());
    }
    
    @Test
    public void testPlanta() {
        assertEquals(59650, nacho.sueldo());
    }
    
}
