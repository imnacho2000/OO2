package ar.edu.unlp.info.oo2.facturacion_llamadas;

import java.util.ArrayList;
import java.util.List;

public class Persoonal {
	
	List<Persona> listaPersonas = new ArrayList<Persona>();
	List<Llamada> listaLlamada = new ArrayList<Llamada>();
	public GuiaTelefonica listaGuiaTelefonica = new GuiaTelefonica();
	
	public Persona registrarUsuario(String data, String nombre, String tipoPersona) {
		Persona persona = creacionTipoPersona(data, nombre, tipoPersona);
		persona.sistema = this;
		listaPersonas.add(persona);
		return persona;
		
	}


	private Persona creacionTipoPersona(String data, String nombre, String tipoPersona) {
		String tel = this.listaGuiaTelefonica.obtenerNuevoNumero();
		if (tipoPersona.equals("fisica")) return new PersonaFisica(nombre,tel,data);
		else if (tipoPersona.equals("juridica")) return new PersonaJuridica(nombre,tel,data);
		return null;
	}
	
	
	public boolean eliminarUsuario(Persona persona) {
		if(listaPersonas.removeIf(elemento -> elemento.equals(persona))) {;
			this.listaGuiaTelefonica.agregarTelefono(this,persona.getTel());
			return true;
		}
		return false;
	}
	
	public Llamada registrarLlamada(Persona emisor , Persona remitente, String tipoDeLlamada, int duracion) {
		Llamada llamada = new Llamada(tipoDeLlamada,emisor,remitente,duracion);
		listaLlamada.add(llamada);
		emisor.agregarLlamada(llamada);
		return llamada;
	}
	
//	public Llamada creacionTipoLlamada(String tipoDeLlamada, Persona emisor, Persona remitente, int duracion) {
//		if(tipoDeLlamada.equals("nacional")) {
//			return new LlamadaLocal(tipoDeLlamada, emisor, remitente, duracion);
//		}
//		else if(tipoDeLlamada.equals("internacional")) {
//			return new LlamadaInternacional(tipoDeLlamada, emisor, remitente, duracion);
//		}
//		return null;
//	}
	
	
	public int cantidadDeUsuarios() {
		return this.listaPersonas.size();
	}

	public boolean existeUsuario(Persona persona) {
		return this.listaPersonas.contains(persona);
	}
	
}
