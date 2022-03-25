package com.example.demo.wep;

import com.example.demo.domain.album;
import com.example.demo.domain.songs;
import org.springframework.data.jpa.repository.JpaRepository;

public interface songsRepo extends JpaRepository<songs, Long> {
     songs findByTitleAndAlbum(String title, album albums);

     songs findByTitle(String title);
}