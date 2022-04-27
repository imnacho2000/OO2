package ar.edu.unlp.info.oo2.facturacion_llamadas;

public class PersonaFisica extends Persona {
	private String doc;
	
	
	public PersonaFisica(String nombreyape,String telefono,String doc) {
		super(nombreyape, telefono);
		this.doc = doc;
	}

	public String getDoc() {
		return doc;
	}

	public void setDoc(String doc) {
		this.doc = doc;
	}

	@Override
	public double getDescuento() {
		return 0;
	}

	@Override
	public String getTipoPersona() {
		return "fisica";
	}


	
	
	
}
