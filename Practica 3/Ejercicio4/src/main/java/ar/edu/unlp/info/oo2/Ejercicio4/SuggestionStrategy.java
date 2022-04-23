package ar.edu.unlp.info.oo2.Ejercicio4;

import java.util.List;
import java.util.stream.Stream;

public abstract class SuggestionStrategy {
	
	protected abstract Stream<Movie> streams(List<Movie> collect);
	
	public List<Movie> sugeridos(Decoder dato){
		return this.streams(dato.getMovies().stream().filter(m -> !dato.getPlayedMovies().contains(m)).toList()).limit(3).toList();
	};
}
