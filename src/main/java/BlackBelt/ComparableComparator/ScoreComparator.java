package BlackBelt.ComparableComparator;

import java.util.Comparator;

public class ScoreComparator implements Comparator<Unit> {
    @Override
    public int compare(Unit o1, Unit o2) {
        return o1.Score - o2.Score;
    }
}
