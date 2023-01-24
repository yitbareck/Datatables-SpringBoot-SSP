package net.manyahl.datatablesspringboot.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.manyahl.datatablesspringboot.service.MovieService;

@RestController
@RequestMapping("api/v1/movies")
public class MovieController {
	@Autowired
	private MovieService movieService;

	@PostMapping
	public ResponseEntity<?> getAllMovies(HttpServletRequest request) {
		return movieService.getAllMovies(request);
	}
}
