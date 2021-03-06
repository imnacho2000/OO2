package ar.edu.unlp.info.oo2.Ejercicio3;

import java.util.ArrayList;

public class Proyecto {
	private double dineroRecibido,dineroNecesario;
	private String nombreProyecto;
	private Emprendedor responable;
	private ArrayList<Persona> personasQueInviertieron;
	
	private EstadoProyecto estado;
	
	public Proyecto(String nombreProyecto,double dineroNecesario,Emprendedor responsable) {
		this.dineroNecesario = dineroNecesario;
		this.nombreProyecto = nombreProyecto;
		this.responable = responsable;
		this.estado = new Publicar(this);
		this.responable.addProyecto(this);
		this.personasQueInviertieron = new ArrayList<Persona>();
	}
	
	public void setEstado(EstadoProyecto estado) {
		this.estado = estado;
	}
	
	public String getEstado() {
		return this.estado.getEstado();
	}
	
	public void publicar() {
		this.estado.publicar();
	}
	
	public void Cancelar() {
		this.estado.cancelar();	
	}

	public String getNombreProyecto() {
		return nombreProyecto;
	}

	public double consultarMontoTotalRecibido() {
		return this.dineroRecibido;
	}
	
	public double getDineroNecesario() {
		return this.dineroNecesario;
	}
	
	public void addDinero(double unValor) {
		this.dineroRecibido += unValor;
	} 
	
	public void invertirDinero(double dineroRecibido) {
		this.estado.invertirDinero(dineroRecibido);
	}
	
	public void aniadirPersonaInvertida(Persona persona) {
		this.personasQueInviertieron.add(persona);
	}
	
	public Persona getPersonaInvirtio(String nombre) {
		return this.personasQueInviertieron.stream().filter(p -> p.getNombre().equals(nombre)).findFirst().orElse(null);
	}
	
}
