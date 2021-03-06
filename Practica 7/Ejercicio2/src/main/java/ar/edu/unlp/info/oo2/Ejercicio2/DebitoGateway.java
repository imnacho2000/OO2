package ar.edu.unlp.info.oo2.Ejercicio2;

import java.util.ArrayList;

public class DebitoGateway {
	private ArrayList<String> errores;
	
	
	public DebitoGateway() {
		this.errores = new ArrayList<String>();
	}
	
	
	public void addError(String error) {
		this.errores.add(error);
	}
	
	public ArrayList<String> autorizarMontoConCBU(double unMonto, String cbu) {
		return errores;
	}
	
	public boolean pagarMontoConCBU(double unMonto, String cbu) {
		if(this.autorizarMontoConCBU(unMonto,cbu).size() > 0) {
			for(String error:this.errores) {
				System.out.println(error);
			}
			return false;
		}
		return true;
	}
	
}
