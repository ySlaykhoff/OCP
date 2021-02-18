package capter14.generics.blackBelt;

public class Test {
    public static void main(String[] args) {
        Scoolar scoolar1 = new Scoolar("Vasya", 13);
        Scoolar scoolar2 = new Scoolar("Petya", 14);
        Scoolar scoolar3 = new Scoolar("Vanya", 15);
        Scoolar scoolar4 = new Scoolar("Egor", 13);
        Student student1 = new Student("Ildar", 32);
        Student student2 = new Student("Roman", 35);


        Team<Scoolar> team1 = new Team<>("Sparta");
        Team<Scoolar> team2 = new Team<>("Veter");
        Team<Student> team3 = new Team<>("Plank");

        team1.addNewParticipant(scoolar1);
        team1.addNewParticipant(scoolar3);
        team2.addNewParticipant(scoolar2);
        team2.addNewParticipant(scoolar4);

        team1.playWith(team2);
    }
}
