package sda.FootballTeam1;

public class Footballer implements Cloneable {

    String name;
    String lastName;
    String position;
    FootballClub footballClub;

    public Footballer (String name, String lastName, String position, FootballClub footballClub) {
        this.name = name;
        this.lastName = lastName;
        this.position = position;
        this.footballClub = footballClub;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
