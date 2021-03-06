package ar.edu.unlp.info.oo2.Ejercicio3;

import java.util.ArrayList;

public class Emprendedor {
	private String nombre;
	private ArrayList<Proyecto>proyectos;
	
	public Emprendedor(String nombre) {
		this.nombre = nombre;
		this.proyectos = new ArrayList<Proyecto>();
	}
	
	public void crearProyecto(String nombreProyecto,double dineroNecesario) {
		Proyecto proyecto = new Proyecto(nombreProyecto,dineroNecesario,this);
		this.proyectos.add(proyecto);
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void addProyecto(Proyecto proyecto) {
		this.proyectos.add(proyecto);
	}
	
	public Proyecto getProyecto(String nombreProyecto) {
		return this.proyectos.stream().filter(p -> p.getNombreProyecto().equals(nombreProyecto)).findFirst().orElse(null);
	}
	
}
