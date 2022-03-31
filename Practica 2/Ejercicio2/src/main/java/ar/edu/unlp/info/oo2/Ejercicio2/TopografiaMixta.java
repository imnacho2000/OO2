package ar.edu.unlp.info.oo2.Ejercicio2;

import java.util.*;  


public class TopografiaMixta extends Topografia {
	private Vector<Topografia> componentes;
	
	
	public TopografiaMixta(Topografia t1, Topografia t2, Topografia t3, Topografia t4) {
		this.componentes = new Vector<Topografia>(4);
		this.componentes.add(t1);
		this.componentes.add(t2);
		this.componentes.add(t3);
		this.componentes.add(t4);
	}


	@Override
	public double calcularProporcion() {
		return this.componentes.stream().mapToDouble(p -> p.calcularProporcion()).sum() / 4;
	}
	
	public boolean comparar(Topografia t1) {
		if(this.calcularProporcion() == t1.calcularProporcion()){
			return this.componentes.equals(t1.getTopografia());
		}
		return false;
	}


	@Override
	protected Vector<Topografia> getTopografia() {
		return this.componentes;
	}
	
}
