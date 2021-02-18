package capter14.generics.blackBelt;



import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Team {


    private String name;
    private List<Person> participants= new ArrayList<>();

    public String getName() {
        return name;
    }

    public Team(String name) {
        this.name = name;
    }

    public void addNewParticipant(Person participant){
        participants.add(participant);
        System.out.println("Добавлен новый учатник - " + participant.getName());
    }

    public void playWith(Team team){
        String winnerName;
        Random random = new Random();
        int status = random.nextInt(2);

        if (status == 0){
            winnerName = this.getName();
        }
        else {
          winnerName = team.getName();
        }

        System.out.println("Выграла команда - " + winnerName);
    }
}
