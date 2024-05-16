package com.example.Movie.service;

import com.example.Movie.entity.Movie;
import com.example.Movie.entity.Users;


public interface UsersService {
    Users getMovieById(Long id);
    void saveMovies(Users users);
}
