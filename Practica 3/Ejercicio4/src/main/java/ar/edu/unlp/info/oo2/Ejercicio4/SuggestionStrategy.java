package ar.edu.unlp.info.oo2.Ejercicio4;

import java.util.List;

public interface SuggestionStrategy {
	
	public List<Movie> sugeridos(Decoder dato);
}
