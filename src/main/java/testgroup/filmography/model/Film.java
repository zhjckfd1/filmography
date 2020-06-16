package testgroup.filmography.model;

import javax.persistence.*;

@Entity
@Table(name = "films")
public class Film {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "title")
    private String title;

    @Column(name = "year")
    private int year;

    @Column(name = "genre")
    private String genre;

    @Column(name = "watched")
    private boolean watched;

//    @Id
//    @Column(name = "id")
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // лучше на гетеры?
    public int getId() {
        return id;
    }

    public int getYear() {
        return year;
    }

    public String getGenre() {
        return genre;
    }

//    @Column(name = "title")
    public String getTitle() {
        return title;
    }

    public boolean isWatched() {
        return watched;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setWatched(boolean watched) {
        this.watched = watched;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setId(int id) {
        this.id = id;
    }

}
