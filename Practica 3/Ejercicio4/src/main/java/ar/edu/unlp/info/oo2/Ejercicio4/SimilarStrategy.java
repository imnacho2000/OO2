package ar.edu.unlp.info.oo2.Ejercicio4;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SimilarStrategy extends SuggestionStrategy {
	
	protected Stream<Movie> streams(List<Movie> collect) {
		return collect.stream().sorted(Comparator.comparing(Movie::getReleaseYear).reversed()).toList().stream().filter(m -> m.getSimilarMovies().stream().anyMatch(n -> n.getSimilarMovies().contains(m)));
	}
}
	