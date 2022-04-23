package ar.edu.unlp.info.oo2.Ejercicio4;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class ScoreStrategy extends SuggestionStrategy {

	protected Stream<Movie> streams(List<Movie> collect) {
		return collect.stream().sorted(Comparator.comparingDouble(Movie::getScore).reversed().thenComparing(Comparator.comparing(Movie::getReleaseYear).reversed()));
	}
}
