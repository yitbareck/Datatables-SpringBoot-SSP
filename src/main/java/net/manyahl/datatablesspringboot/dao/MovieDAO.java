package net.manyahl.datatablesspringboot.dao;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

import net.manyahl.datatablesspringboot.model.Movie;

@Component
public class MovieDAO {
	private List<Movie> movies = null;

	@PostConstruct
	public void generateMoviData() {
		movies = new ArrayList<>();
		movies.add(new Movie(1, "Avatar", LocalDate.of(2009, 12, 02), 5));
		movies.add(new Movie(1, "Avatar: The Way of Water", LocalDate.of(2022, 12, 16), 5));
		movies.add(new Movie(1, "Titanic", LocalDate.of(1997, 12, 10), 5));
		movies.add(new Movie(1, "The Grey", LocalDate.of(2012, 03, 22), 4.5f));
		movies.add(new Movie(1, "Unknown", LocalDate.of(2011, 05, 19), 3.5f));
	}

	public List<Movie> getAllMovies(int start, int length) {
		return movies.stream().skip(start).limit(length).collect(Collectors.toList());
	}

	public int getAllMoviesCount() {
		return movies.size();
	}
}
