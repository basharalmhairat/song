package com.example.demo.domain;
import javax.persistence.*;

@Entity
public class songs
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    String title;
    int trackNumber;

    @ManyToOne
    album albums;


    public songs(){}

    public songs(String title, int trackNumber, album albums) {
        this.title = title;
        this.trackNumber = trackNumber;
        this.albums = albums;
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getTrackNumber() {
        return trackNumber;
    }

    public album getAlbum() {
        return albums;
    }

}

