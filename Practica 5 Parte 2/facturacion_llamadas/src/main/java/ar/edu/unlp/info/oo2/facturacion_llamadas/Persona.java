package ar.edu.unlp.info.oo2.facturacion_llamadas;

import java.util.ArrayList;
import java.util.List;

public abstract class Persona {
	private List<Llamada> listaLlamadas = new ArrayList<Llamada>();
	protected String nya;
	protected String tel;
	protected double descuento;
	protected Persoonal sistema; 
	
	public Persona(String nya, String tel) {
		super();
		this.nya = nya;
		this.tel = tel;
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
		return nya;
	}
	
	public void setNya(String nya) {
		this.nya = nya;
	}
	
	public String getTel() {
		return tel;
	}
	
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	public abstract String getTipoPersona();
	
	public abstract double getDescuento();

	public double calcularMontoTotalLlamadas(Persoonal sistema) {
//		double monto = 0;
		return  this.getLlamadas().stream().mapToDouble(elementos -> elementos.calcularCosto() - (elementos.calcularCosto() * this.getDescuento())).sum();
//		return this.getLlamadas().stream().mapto
//		for (Llamada llamada : this.getLlamadas()) {
//			double aux = 0;
//			aux += llamada.calcularCosto();
////			if (llamada.getTipo().equals("nacional")) {
////				auxc += llamada.calcularCosto();
////			} else if (llamada.getTipo().equals("internacional")) {
////				auxc += llamada.calcularCosto();
////			}
//			aux -= aux * this.getDescuento();
//	
//			
//			monto += aux;
//		}
//		return monto;
	}
}
