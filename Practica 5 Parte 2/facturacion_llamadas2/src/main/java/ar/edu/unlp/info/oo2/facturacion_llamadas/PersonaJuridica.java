package ar.edu.unlp.info.oo2.facturacion_llamadas;

public class PersonaJuridica extends Persona{
	private String cuit;
	
	public PersonaJuridica(String nombreyape, String telefono,String cuit) {
		super(nombreyape, telefono);
		this.cuit = cuit;
	}
	
	public String getCuit() {
		return cuit;
	}
	
	public void setCuit(String cuit) {
		this.cuit = cuit;
	}

	@Override
	public double getDescuento() {
		if(this.getTipoPersona().equals("juridica")) return 0.15;
		return -1;
	}

	@Override
	public String getTipoPersona() {
		return "juridica";
	}
	
}
	
