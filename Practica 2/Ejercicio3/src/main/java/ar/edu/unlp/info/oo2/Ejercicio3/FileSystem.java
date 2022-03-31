package ar.edu.unlp.info.oo2.Ejercicio3;

import java.time.LocalDate;

public abstract class FileSystem {
	protected String nombre;
	protected LocalDate fecha;
	protected int tamanio;

	public int getTamanio() {
		return this.tamanio;
	};
	
	public LocalDate getFecha() {
		return this.fecha;
	}

}
