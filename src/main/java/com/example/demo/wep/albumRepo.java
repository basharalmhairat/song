package com.example.demo.wep;

import com.example.demo.domain.album;
import org.springframework.data.repository.CrudRepository;

public interface albumRepo extends CrudRepository<album, Long>{}

