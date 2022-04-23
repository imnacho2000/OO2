package ar.edu.unlp.info.oo2.Ejercicio1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Autor {
	private List<Album> albumes;
	private String nombre;
	
	public Autor(String nombre) {
		super();
		this.nombre = nombre.toLowerCase();
		this.albumes = new ArrayList<Album>();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre.toLowerCase();
	}
	
	public void agregarAlbum(Album dato) {
		this.albumes.add(dato);
	}

	public List<Tema> buscar(String dato) {
		if(this.getNombre().contains(dato)) {
			return this.albumes.stream().flatMap(p -> p.getTemas().stream()).collect(Collectors.toList());
		}
		return this.albumes.stream().flatMap(p -> p.buscar(dato).stream()).collect(Collectors.toList());
		
	}
	
}
