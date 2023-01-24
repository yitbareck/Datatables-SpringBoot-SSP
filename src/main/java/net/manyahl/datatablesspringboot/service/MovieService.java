package net.manyahl.datatablesspringboot.service;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import net.manyahl.datatablesspringboot.dao.MovieDAO;
import net.manyahl.datatablesspringboot.model.datatables.DataTableResponse;

@Service
public class MovieService {
	@Autowired
	private MovieDAO movieDAO;

	public ResponseEntity<?> getAllMovies(HttpServletRequest request) {
		int draw = Integer.parseInt(request.getParameter("draw"));
		int start = Integer.parseInt(request.getParameter("start"));
		int length = Integer.parseInt(request.getParameter("length"));

		int recordsTotal = movieDAO.getAllMoviesCount();
		var movies = movieDAO.getAllMovies(start, length);

		return ResponseEntity.ok(new DataTableResponse(draw, recordsTotal, recordsTotal, movies));
	}
}
