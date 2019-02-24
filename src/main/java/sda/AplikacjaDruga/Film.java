package sda.AplikacjaDruga;

public class Film implements  Cloneable{

    String title;
    int date;
    Director director;

    public Film (String title, int date,  Director director) {
        this.title = title;
        this.date = date;
        this.director = director;
    }


    protected Object clone() throws CloneNotSupportedException {
        Film film = (Film) super.clone();
        film.director = (Director) director.clone();
        return film;
    }
}