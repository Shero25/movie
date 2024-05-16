package com.example.Movie.controller;

import com.example.Movie.entity.Users;
import com.example.Movie.service.UsersServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/users")
@CrossOrigin("*")
public class UsersController {

    @Autowired
    private UsersServiceImpl usersService;

    @PostMapping
    public  void save(@RequestBody Users users)
    {
        usersService.saveMovies(users);
    }
    @GetMapping("/{id}")
    public Users findOneById(@PathVariable Long id)
    {
        return  usersService.getMovieById(id);
    }
}
