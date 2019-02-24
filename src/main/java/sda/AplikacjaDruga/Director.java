package sda.AplikacjaDruga;

public class Director  implements Cloneable {

    String name;
    String lastName;
    String typeOfFilm;

    public Director (String name, String lastName, String typeOfFilm) {
        this.name = name;
        this.lastName = lastName;
        this.typeOfFilm = typeOfFilm;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
