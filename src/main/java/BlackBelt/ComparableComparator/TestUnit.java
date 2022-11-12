package BlackBelt.ComparableComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestUnit {
    public static void main(String[] args) {
        List<Unit> units = new ArrayList<>();
        Unit unit1 = new Unit(1,"unit1", "Petrov", 354);
        Unit unit2 = new Unit(4,"unit2", "Sidorov", 243);
        Unit unit3 = new Unit(3,"unit3", "Ivanov", 302);
        Unit unit4 = new Unit(2,"unit4", "Volkov", 289);
        units.add(unit1);
        units.add(unit2);
        units.add(unit3);
        units.add(unit4);

        System.out.println(units);
        System.out.println("====================================================");
        System.out.println("Sort by ID");
        Collections.sort(units);
        System.out.println(units);
        System.out.println("====================================================");
        System.out.println("Sort by Name");

        System.out.println(units);
        System.out.println("====================================================");
        System.out.println("Sort by LastName");
        Collections.sort(units, new LastNameComparator());
        System.out.println(units);
        System.out.println("====================================================");
        System.out.println("Sort by Score");
        Collections.sort(units, new ScoreComparator());
        System.out.println(units);
    }
}
