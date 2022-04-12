package ar.edu.unlp.info.oo2.biblioteca;

import java.util.List;

public class VoorheesExporter  {
	private Exporter exporter = new AdapterJackson();
	
	public String exportar(List<Socio> socios) {
		return exporter.exportar(socios);
	}
	
	
}
