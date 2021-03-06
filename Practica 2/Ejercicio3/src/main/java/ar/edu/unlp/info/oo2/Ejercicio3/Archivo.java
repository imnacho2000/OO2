package ar.edu.unlp.info.oo2.Ejercicio3;

import java.time.LocalDate;

public class Archivo extends FileSystem{

	public Archivo(String nombre, LocalDate fecha, int tamanio) {
		this.nombre = nombre;
		this.fecha = fecha;
		this.tamanio = tamanio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public Archivo archivoMasGrande() {
		return this	;
	}

	@Override
	public Archivo archivoMasNuevo() {
		return this;
	}

	
}
