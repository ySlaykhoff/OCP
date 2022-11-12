package BlackBelt.ComparableComparator;

import java.util.Comparator;

public class NameComparator implements Comparator<Unit> {
    @Override
    public int compare(Unit o1, Unit o2) {
        return o1.Name.compareTo(o2.Name);
    }
}

