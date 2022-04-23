package ar.edu.unlp.info.oo2.Ejercicio1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Album {
	private List<Tema> temas;
	private String nombre;
	
	public Album(String nombre) {
		super();
		this.nombre = nombre.toLowerCase();
		this.temas = new ArrayList<Tema>();
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre.toLowerCase();
	}

	public List<Tema> getTemas() {
		return temas;
	}
	
	public void agregarTema(Tema dato) {
		this.temas.add(dato);
	}

	public void setTemas(ArrayList<Tema> temas) {
		this.temas = temas;
	}
	
	public List<Tema> buscar(String dato) {
		if(this.getNombre().contains(dato)) {
			return this.getTemas();
		}
		return this.temas.stream().flatMap(p -> p.buscar(dato).stream()).collect(Collectors.toList());
	}
	
	
}
