package com.example.Movie.repository;

import com.example.Movie.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsersRepository  extends JpaRepository<Users,Long> {
    Optional<Users> findByEmail(String email);
}