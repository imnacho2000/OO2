package ar.edu.unlp.info.oo2.facturacion_llamadas;

import java.util.ArrayList;
import java.util.List;

public abstract class Persona {
	private List<Llamada> listaLlamadas;
	protected String nombreYApellido;
	protected String telelefono;
	protected double descuento;
	protected Persoonal sistema; 
	
	public Persona(String nombreYApellido, String telelefono) {
		super();
		this.listaLlamadas = new ArrayList<Llamada>();
		this.nombreYApellido = nombreYApellido;
		this.telelefono = telelefono;
	}
	
	public List<Llamada> getLlamadas() { 
		return this.listaLlamadas;
	}
	
	public void agregarLlamada(Llamada llamada) {
		this.listaLlamadas.add(llamada);
	}
	
	public void setLlamada(List<Llamada> listaLlamadas) {
		this.listaLlamadas = listaLlamadas;
	}
	
	public String getNya() {
		return nombreYApellido;
	}
	
	public void setNya(String nombreYApellido) {
		this.nombreYApellido = nombreYApellido;
	}
	
	public String getTel() {
		return telelefono;
	}
	
	public void setTel(String telelefono) {
		this.telelefono = telelefono;
	}
	
	public abstract double getDescuento();
	

	public double calcularMontoTotalLlamadas(Persoonal sistema) {
		return  this.getLlamadas().stream().mapToDouble(elementos -> elementos.calcularCosto() - (elementos.calcularCosto() * this.getDescuento())).sum();
	}
}
