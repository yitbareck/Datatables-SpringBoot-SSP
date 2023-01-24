package net.manyahl.datatablesspringboot.controller;

import net.manyahl.datatablesspringboot.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/movies")
public class MovieController {
	@Autowired
	private MovieService movieService;

	@GetMapping
	public String showAllMoviesTale() {
		return "movies";
	}

	@PostMapping("/get-all")
	public ResponseEntity<?> getAllMovies(HttpServletRequest request) {
		return movieService.getAllMovies(request);
	}
}
