package ar.edu.unlp.info.oo2.biblioteca;


import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class AdapterJackson implements Exporter {

	@Override
	public String exportar(List<Socio> socios) {
		ObjectMapper mapeoSocios = new ObjectMapper();
		String sociotis = "";
		try {
			sociotis = mapeoSocios.writeValueAsString(socios);
		} catch (JsonProcessingException e) {
				
			e.printStackTrace();
		}
		
		return sociotis;
	}
		
}
