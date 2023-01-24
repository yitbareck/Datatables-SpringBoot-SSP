package net.manyahl.datatablesspringboot.model;

import java.time.LocalDate;

public class Movie {
	private int id;
	private String title;
	private LocalDate releaseDate;
	private float rating;
	
	public Movie() {}

	public Movie(int id, String title, LocalDate releaseDate, float rating) {
		this.id = id;
		this.title = title;
		this.releaseDate = releaseDate;
		this.rating = rating;
	}

	public int getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public LocalDate getReleaseDate() {
		return releaseDate;
	}

	public void setReleaseDate(LocalDate releaseDate) {
		this.releaseDate = releaseDate;
	}

	public float getRating() {
		return rating;
	}

	public void setRating(float rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "Movie [id=" + id + ", title=" + title + ", releaseDate=" + releaseDate + ", rating=" + rating + "]";
	}
	
}
