package ar.edu.unlp.info.oo2.facturacion_llamadas;

import java.util.TreeSet;
import java.util.SortedSet;

public class GuiaTelefonica {
	private SortedSet<String> guia;
	
	public GuiaTelefonica() {
		 this.guia = new TreeSet<String>();
	}

	public boolean agregarTelefono(Persoonal sistema,String str) {
		if (!this.guia.contains(str)) {
			this.guia.add(str);
			return true;
		}
		return false;
	}
	
	
	public void eliminarTelefono(String str) {
		this.guia.removeIf(elemento -> elemento.equals(str));
	}
	
	public String obtenerNuevoNumero() {
		String tel = this.guia.last();
		this.guia.remove(tel);
		return tel;
	}
	
}
