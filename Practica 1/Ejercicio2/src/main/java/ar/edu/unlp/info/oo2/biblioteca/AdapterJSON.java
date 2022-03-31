package ar.edu.unlp.info.oo2.biblioteca;

import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class AdapterJSON extends VoorheesExporter {
	
	public AdapterJSON(Biblioteca biblio) {
		biblio.setExporter(this);
	}
	
	public String exportar(List<Socio> socios) {
		JSONArray arregloSocios = new JSONArray();
		for (Socio n:socios) {
			JSONObject obj = new JSONObject();
			obj.put("nombre", n.getNombre());
			obj.put("legajo", n.getLegajo());
			obj.put("email",n.getEmail());
			arregloSocios.add(obj);
		}
		return arregloSocios.toJSONString();
	}

}
