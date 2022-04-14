package ar.edu.unlp.info.oo2.Ejercicio2;

import java.time.LocalDate;

public abstract class DecoratorFile implements File002 {
	protected File002 Component;
	
	abstract String print();
	
	public DecoratorFile(File002 dato) {
		this.Component = dato;
	}

	@Override
	public String prettyString() {
		if(this.Component.prettyString() != "") {
			return this.print() + " - " + this.Component.prettyString();
		}
		return this.print();
	}

	@Override
	public String getNombre() {
		// TODO Auto-generated method stub
		return this.Component.getNombre();
	}

	@Override
	public String getExtension() {
		// TODO Auto-generated method stub
		return this.Component.getExtension();
	}

	@Override
	public String getPermisos() {
		// TODO Auto-generated method stub
		return this.Component.getPermisos();
	}

	@Override
	public Double getTamanio() {
		// TODO Auto-generated method stub
		return this.Component.getTamanio();
	}

	@Override
	public LocalDate getFechaCreacion() {
		// TODO Auto-generated method stub
		return this.Component.getFechaCreacion();
	}

	@Override
	public LocalDate getFechaModificacion() {
		// TODO Auto-generated method stub
		return this.Component.getFechaModificacion();
	}
	
}
