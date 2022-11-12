package BlackBelt.ComparableComparator;

public class Unit implements Comparable<Unit> {
    int ID;
    String Name;
    String LastName;
    int Score;


    public Unit(int ID, String Name, String LastName, int Score) {
        this.ID = ID;
        this.Name = Name;
        this.LastName = LastName;
        this.Score = Score;
    }


    @Override
    public int compareTo(Unit o) {
        return this.ID - o.ID;
    }

    @Override
    public String toString() {
        return "Unit{" +
                "ID=" + ID +
                ", Name='" + Name + '\'' +
                ", LastName='" + LastName + '\'' +
                ", Score=" + Score +
                '}';
    }
}
