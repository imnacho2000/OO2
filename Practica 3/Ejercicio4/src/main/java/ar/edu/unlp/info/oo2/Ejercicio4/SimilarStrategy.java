package ar.edu.unlp.info.oo2.Ejercicio4;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SimilarStrategy implements SuggestionStrategy {


	@Override
	public List<Movie> sugeridos(Decoder dato) {
		List<Movie> lista =  dato.getMovies().stream().filter(m -> !(dato.getPlayedMovies().contains(m))).toList().stream().sorted(Comparator.comparing(Movie::getReleaseYear).reversed()).toList();
		return lista.stream().filter(m -> m.getSimilarMovies().stream().anyMatch(n -> n.getSimilarMovies().contains(m))).limit(3).toList();
	}
}
	