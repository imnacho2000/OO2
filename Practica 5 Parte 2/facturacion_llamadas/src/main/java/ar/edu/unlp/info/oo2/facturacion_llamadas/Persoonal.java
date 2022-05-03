package ar.edu.unlp.info.oo2.facturacion_llamadas;

import java.util.ArrayList;
import java.util.List;

public class Persoonal {
	
	private List<Persona> listaPersonas;
	private List<Llamada> listaLlamada;
	private GuiaTelefonica listaGuiaTelefonica;
	
	public Persoonal() {
		this.listaPersonas = new ArrayList<Persona>();
		this.listaLlamada = new ArrayList<Llamada>();
		this.listaGuiaTelefonica = new GuiaTelefonica();
	}
	
	
	public Persona registrarUsuario(String data, String nombre, String tipoPersona) {
		Persona persona = creacionTipoPersona(data, nombre, tipoPersona);
		persona.sistema = this;
		this.listaPersonas.add(persona);
		return persona;
		
	}


	private Persona creacionTipoPersona(String data, String nombre, String tipoPersona) {
		String tel = this.getListaGuiaTelefonica().obtenerNuevoNumero();
		if (tipoPersona.equals("fisica")) return new PersonaFisica(nombre,tel,data);
		else if (tipoPersona.equals("juridica")) return new PersonaJuridica(nombre,tel,data);
		return null;
	}
	
	
	public boolean eliminarUsuario(Persona persona) {
		if(this.listaPersonas.removeIf(elemento -> elemento.equals(persona))) {;
			this.getListaGuiaTelefonica().agregarTelefono(persona.getTel());
			return true;
		}
		return false;
	}
	
	public Llamada registrarLlamada(Persona emisor , Persona remitente, String tipoDeLlamada, int duracion) {
		Llamada llamada = creacionTipoLlamada(tipoDeLlamada,emisor,remitente,duracion);
		this.listaLlamada.add(llamada);
		emisor.agregarLlamada(llamada);
		return llamada;
	}
	
	public Llamada creacionTipoLlamada(String tipoDeLlamada, Persona emisor, Persona remitente, int duracion) {
		if(tipoDeLlamada.equals("nacional")) {
			return new LlamadaLocal(tipoDeLlamada, emisor, remitente, duracion);
		}
		else if(tipoDeLlamada.equals("internacional")) {
			return new LlamadaInternacional(tipoDeLlamada, emisor, remitente, duracion);
		}
		return null;
	}
	
	
	public int cantidadDeUsuarios() {
		return this.listaPersonas.size();
	}

	public boolean existeUsuario(Persona persona) {
		return this.listaPersonas.contains(persona);
	}


	public GuiaTelefonica getListaGuiaTelefonica() {
		return listaGuiaTelefonica;
	}


	public void setListaGuiaTelefonica(GuiaTelefonica listaGuiaTelefonica) {
		this.listaGuiaTelefonica = listaGuiaTelefonica;
	}
	
}
