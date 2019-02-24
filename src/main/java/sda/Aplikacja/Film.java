package sda.Aplikacja;

public class Film implements  Cloneable{

    String title;
    int date;
    Director director;

   public Film (String title, int date,  Director director) {
        this.title = title;
        this.date = date;
        this.director = director;
    }



    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
