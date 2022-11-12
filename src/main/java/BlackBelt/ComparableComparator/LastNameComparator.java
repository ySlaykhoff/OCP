package BlackBelt.ComparableComparator;

import java.util.Comparator;

public class LastNameComparator implements Comparator<Unit> {
    @Override
    public int compare(Unit o1, Unit o2) {
        return o1.LastName.compareTo(o2.LastName);
    }
}
