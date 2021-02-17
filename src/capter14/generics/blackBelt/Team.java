package capter14.generics.blackBelt;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private String name;
    private List<Person> persons= new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }
}
