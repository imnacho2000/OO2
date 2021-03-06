package ar.edu.unlp.info.oo2.biblioteca;

import java.util.ArrayList;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BibliotecaTest {
	
	Biblioteca biblioteca;
	Socio tyron;
	Socio arya;
	
	@BeforeEach
	void setUp() throws Exception {
		biblioteca = new Biblioteca();
		arya = new Socio("Arya Stark", "needle@stark.com", "5234-5");
		tyron = new Socio("Tyron Lannister", "tyron@thelannisters.com",  "2345-2");
		biblioteca.agregarSocio(arya);
		biblioteca.agregarSocio(tyron);
	}
    @Test
	public void testBiblioteca() {
		System.out.println(biblioteca.exportarSocios());
		Object obj = JSONValue.parse(biblioteca.exportarSocios());
		JSONArray arrayJSON = (JSONArray) obj;
		List<Socio> arraySocios = new ArrayList<Socio>();
		
		arraySocios.add(arya);
		arraySocios.add(tyron);
		
		for(int i = 0; i < arrayJSON.size(); i++) {
			JSONObject compararSocio = (JSONObject)arrayJSON.get(i);
			Assertions.assertEquals(compararSocio.get("nombre"),arraySocios.get(i).getNombre());
			Assertions.assertEquals(compararSocio.get("legajo"),arraySocios.get(i).getLegajo());
			Assertions.assertEquals(compararSocio.get("email"),arraySocios.get(i).getEmail());
		}
	}
}
