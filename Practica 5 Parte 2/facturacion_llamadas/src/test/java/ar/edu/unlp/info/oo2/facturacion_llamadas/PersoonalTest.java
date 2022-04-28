package ar.edu.unlp.info.oo2.facturacion_llamadas;

import static org.junit.jupiter.api.Assertions.*;

import java.text.DecimalFormat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PersoonalTest {
	
	Persoonal sistema;
	Persona emisorPersonaFisca, remitentePersonaFisica, emisorPersonaJuridica, remitentePersonaJuridica;
	
	@BeforeEach
	public void setUp() {
		this.sistema = new Persoonal();
		this.sistema.getListaGuiaTelefonica().agregarTelefono(this.sistema, "2214444554");
		this.sistema.getListaGuiaTelefonica().agregarTelefono(this.sistema, "2214444555");
		this.sistema.getListaGuiaTelefonica().agregarTelefono(this.sistema, "2214444556");
		this.sistema.getListaGuiaTelefonica().agregarTelefono(this.sistema, "2214444557");
		
		this.emisorPersonaFisca = sistema.registrarUsuario("11555666", "Marcelo Tinelli" , "fisica");
		this.remitentePersonaFisica = sistema.registrarUsuario("00000001", "Mirtha Legrand" , "fisica");
		this.emisorPersonaJuridica = sistema.registrarUsuario("17555222", "Felfort" , "juridica");
		this.remitentePersonaJuridica = sistema.registrarUsuario("25765432", "Moovistar" , "juridica");
		
		this.sistema.registrarLlamada(emisorPersonaJuridica, remitentePersonaFisica, "nacional", 10);
		this.sistema.registrarLlamada(emisorPersonaJuridica, remitentePersonaFisica, "internacional", 8);
		this.sistema.registrarLlamada(emisorPersonaJuridica, remitentePersonaJuridica, "nacional", 5);
		this.sistema.registrarLlamada(emisorPersonaJuridica, remitentePersonaJuridica, "internacional", 7);
		this.sistema.registrarLlamada(emisorPersonaFisca, remitentePersonaFisica, "nacional", 15);
		this.sistema.registrarLlamada(emisorPersonaFisca, remitentePersonaFisica, "internacional", 45);
		this.sistema.registrarLlamada(emisorPersonaFisca, remitentePersonaJuridica, "nacional", 13);
		this.sistema.registrarLlamada(emisorPersonaFisca, remitentePersonaJuridica, "internacional", 17);
		
	}

	@Test
	void testcalcularMontoTotalLlamadas() {
		DecimalFormat df = new DecimalFormat("#.00");
		assertEquals(df.format(emisorPersonaFisca.calcularMontoTotalLlamadas(this.sistema)),df.format(15105.640000000001));
		assertEquals(df.format(emisorPersonaJuridica.calcularMontoTotalLlamadas(this.sistema)), df.format(3131.7825000000003));
		assertEquals(remitentePersonaFisica.calcularMontoTotalLlamadas(this.sistema), 0);
		assertEquals(remitentePersonaJuridica.calcularMontoTotalLlamadas(this.sistema), 0);
	}
	
	@Test
	void testAgregarUsuario() {
		assertEquals(this.sistema.cantidadDeUsuarios(), 4);
		this.sistema.getListaGuiaTelefonica().agregarTelefono(this.sistema, "2214444558"); 
		Persona nuevaPersona = this.sistema.registrarUsuario("2444555","Chiche Gelblung", "fisica");
		
		assertEquals(this.sistema.cantidadDeUsuarios(), 5);
		assertTrue(this.sistema.existeUsuario(nuevaPersona));
		
	}
	
	@Test
	void testEliminarUsuario() {
		assertEquals(this.sistema.cantidadDeUsuarios(), 4);
		assertTrue(this.sistema.existeUsuario(emisorPersonaFisca));
		this.sistema.eliminarUsuario(emisorPersonaFisca);
		assertEquals(this.sistema.cantidadDeUsuarios(), 3);
		assertFalse(this.sistema.existeUsuario(emisorPersonaFisca));
	}

}
