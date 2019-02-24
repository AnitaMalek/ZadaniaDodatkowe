package sda.FootballTeam1;

public class FootballClub implements Cloneable {

    String name;
    String country;
    Manager manager;

    public FootballClub (String name, String country, Manager manager) {
        this.name = name;
        this.country = country;
        this.manager = manager;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
