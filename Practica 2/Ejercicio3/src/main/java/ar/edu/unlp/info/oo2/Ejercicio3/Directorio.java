package ar.edu.unlp.info.oo2.Ejercicio3;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class Directorio extends FileSystem {
	
	private int contenido;
	private List<FileSystem>contenidos = new ArrayList<FileSystem>();
	
	public Directorio(String nombre, LocalDate fecha) {
		this.nombre = nombre;
		this.fecha = fecha;
		this.contenido = 32;
	}
	
	public void agregar(FileSystem dato) {
		this.contenidos.add(dato);
	}
	
	
	public int tamanoTotalOcupado() {
		return this.contenidos.stream().mapToInt(p -> p.getTamanio()).sum() + this.contenido;
	}
	
	
	public Archivo archivoMasGrande() {
		return this.contenidos.stream().map(c -> c.archivoMasGrande()).max(Comparator.comparing(c -> c.archivoMasGrande().getTamanio())).orElse(null);
	}
		
	public Archivo archivoMasNuevo() {
		return this.contenidos.stream().map(c -> c.archivoMasGrande()).max(Comparator.comparing(c -> c.archivoMasNuevo().getFecha())).orElse(null);
	}

	@Override
	public int getTamanio() {
		return this.tamanoTotalOcupado();
	}
	
}
