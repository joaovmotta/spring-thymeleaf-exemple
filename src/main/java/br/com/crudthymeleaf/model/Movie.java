package br.com.crudthymeleaf.model;

import javax.persistence.*;
import java.util.Map;

@Entity
@Table(name = "movie")
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private String genre;
    private Integer duration;

    public Movie(){}

    public Movie(Map<String,Object> map){

        this.duration = Integer.parseInt(map.get("duration").toString());
        this.title = map.get("title").toString();
        this.genre = map.get("genre").toString();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }
}
