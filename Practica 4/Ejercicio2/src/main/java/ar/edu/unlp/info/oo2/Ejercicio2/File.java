package ar.edu.unlp.info.oo2.Ejercicio2;

import java.time.LocalDate;

public class  File implements File002{
	
	
	private String nombre;
	private String extension;
	private String permisos;
	
	private double tamanio;
	private LocalDate fechaCreacion;
	private LocalDate fechaModificacion;

	
	
	public File(String nombre, String extension, String permisos, double i, LocalDate fechaCreacion,
			LocalDate fechaModificacion) {
		super();
		this.nombre = nombre;
		this.extension = extension;
		this.permisos = permisos;
		this.tamanio = i;
		this.fechaCreacion = fechaCreacion;
		this.fechaModificacion = fechaModificacion;
	}

	@Override
	public String prettyString() {
		// TODO Auto-generated method stub
		return "";
	}

	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return this.nombre;
	}

	@Override
	public String getExtension() {
		// TODO Auto-generated method stub
		return this.extension;
	}

	@Override
	public String getPermisos() {
		// TODO Auto-generated method stub
		return this.permisos;
	}

	@Override
	public Double getTamanio() {
		// TODO Auto-generated method stub
		return this.tamanio;
	}

	@Override
	public LocalDate getFechaCreacion() {
		// TODO Auto-generated method stub
		return this.fechaCreacion;
	}

	@Override
	public LocalDate getFechaModificacion() {
		// TODO Auto-generated method stub
		return this.fechaModificacion;
	}

}
