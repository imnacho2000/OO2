package ar.edu.unlp.info.oo2.Ejercicio4;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class NewesStrategy implements SuggestionStrategy {

	@Override
	public List<Movie> sugeridos(Decoder dato) {
		return  dato.getMovies().stream().filter(m -> !(dato.getPlayedMovies().contains(m))).toList().stream()
				.sorted(Comparator.comparing(Movie::getReleaseYear).reversed()).limit(3).collect(Collectors.toList());
	}
}
