package ar.edu.unlp.info.oo2.Ejercicio4;

import java.util.Comparator;
import java.util.List;

public class ScoreStrategy implements SuggestionStrategy {

	@Override
	public List<Movie> sugeridos(Decoder dato) {
	    return   dato.getMovies().stream().filter(m -> !dato.getPlayedMovies().contains(m)).toList().stream()
	            .sorted(Comparator.comparingDouble(Movie::getScore).reversed()
	            .thenComparing(Comparator.comparing(Movie::getReleaseYear).reversed()))
	            .limit(3)
	            .toList(); 
	}
}
