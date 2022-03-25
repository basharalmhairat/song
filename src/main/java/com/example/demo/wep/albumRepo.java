package com.example.demo.wep;


import com.example.demo.domain.album;
import org.springframework.data.jpa.repository.JpaRepository;

public interface albumRepo extends JpaRepository<album, Long> {
    public album findByTitle(String title);
}

