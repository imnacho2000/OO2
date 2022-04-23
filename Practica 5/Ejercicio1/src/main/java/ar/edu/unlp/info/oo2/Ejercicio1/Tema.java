package ar.edu.unlp.info.oo2.Ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class Tema {
	private String nombre;
	
	public Tema(String nombre) {
		this.nombre = nombre.toLowerCase();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre.toLowerCase();
	}

	public List<Tema> buscar(String dato) {
		List<Tema> temas = new ArrayList<Tema>();
		if(this.getNombre().contains(dato)) {
			temas.add(this);
		}
		return temas;
	
	}
	
}
