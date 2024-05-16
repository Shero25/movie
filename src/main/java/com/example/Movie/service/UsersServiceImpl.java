package com.example.Movie.service;

import com.example.Movie.entity.Movie;
import com.example.Movie.entity.Users;
import com.example.Movie.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UsersServiceImpl implements UsersService {
    @Autowired
    private UsersRepository usersRepository;

    @Override
    public Users getMovieById(Long id) {
        Optional<Users> Optional=usersRepository.findById(id);
        Users users;

        if(Optional.isPresent()){
            users=Optional.get();
        }else {
            throw new RuntimeException("Id not found");
        }
        return users;
    }

    @Override
    public void saveMovies(Users users) {
        this.usersRepository.save(users);

    }
}
