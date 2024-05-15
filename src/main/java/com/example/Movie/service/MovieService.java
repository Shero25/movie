package com.example.Movie.service;

import com.example.Movie.entity.Movie;

import java.util.List;

public interface MovieService {
    List<Movie> getAllMovies();
    void updateMovies(Long id, Movie movie);
    Movie  getMovieById(Long id);
    void DeleteMovie(Long id);
    void saveMovies(Movie movie);
}
