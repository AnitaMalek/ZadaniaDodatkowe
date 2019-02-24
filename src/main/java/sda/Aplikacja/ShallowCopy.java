package sda.Aplikacja;

public class ShallowCopy {

    public static void main(String[] args) {

        Director director = new Director("Adam", "Małysz", "comedy");
        Film film1 = new Film("Haha", 2010, director);
        Film film2 = null;

        try {
            film2 = (Film) film1.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        System.out.println(film1.director.typeOfFilm);
        System.out.println(film2.director.typeOfFilm);
        film2.director.typeOfFilm = "thriller";
        System.out.println(film1.director.typeOfFilm);
        System.out.println(film2.director.typeOfFilm);

}

}
