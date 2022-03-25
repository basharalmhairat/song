package com.example.demo.domain;

import javax.persistence.*;
import java.util.List;

@Entity
public class album {

    String title;
    String artist;
    double songCount;
    double length;
    String imageUrl;
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
long id;

    @OneToMany(fetch = FetchType.EAGER, mappedBy ="albums")
    List<songs> Songs;


    public album(){}

    public album(String title, String artist, int songCount, int length, String imageUrl) {
        this.title = title;
        this.artist = artist;
        this.songCount = songCount;
        this.length = length;
        this.imageUrl =imageUrl;
    }
    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public double getSongCount() {
        return songCount;
    }

    public double getLength() {
        return length;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setSongCount(int songCount) {
        this.songCount = songCount;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


}
