/**
 * 
 */
package ar.edu.unlp.info.oo2.Ejercicio2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FileTest {
	
	File002 archivo;
	
	@BeforeEach
	void setUp() throws Exception {
		archivo = new File("Fortnite", ".exe","escritura",25,LocalDate.of(2016, 12,31),LocalDate.of(2020, 12,31));
	}
    @Test
    public void testCompleto() {
        DecoratorExtension a = new DecoratorExtension(archivo);
        DecoratorName n = new DecoratorName(a);
        DecoratorPermisos p = new DecoratorPermisos(n);
        DecoratorTamanio t = new DecoratorTamanio(p);
        DecoratorFechaCreacion fc = new DecoratorFechaCreacion(t);
        DecoratorFechaModificacion fd = new DecoratorFechaModificacion(fc);
        assertEquals("2020-12-31 - 2016-12-31 - 25.0 - escritura - Fortnite - .exe", fd.prettyString());
        
    }
}
