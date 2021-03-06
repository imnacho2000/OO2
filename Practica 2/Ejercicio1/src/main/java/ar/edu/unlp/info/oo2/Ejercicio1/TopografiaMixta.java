package ar.edu.unlp.info.oo2.Ejercicio1;

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
	
	@Override
	public boolean equals(Topografia t1) {
		return this.getTopografia().equals(t1.getTopografia());
	}


	@Override
	protected Vector<Topografia> getTopografia() {
		return this.componentes;
	}
	
}
