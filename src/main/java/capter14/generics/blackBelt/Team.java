package capter14.generics.blackBelt;



import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Team<T extends Person> {


    private String name;
    private List<T> participants= new ArrayList<>();

    public String getName() {
        return name;
    }

    public Team(String name) {
        this.name = name;
    }

    public void addNewParticipant(T participant){
        participants.add(participant);
        System.out.println("Добавлен новый учаcтник - " + participant.getName());
    }

    public void playWith(Team<T> team){
        String winnerName;
        Random random = new Random();
        int status = random.nextInt(2);

        if (status == 0){
            winnerName = this.getName();
        }
        else {
          winnerName = team.getName();
        }
        String Str = "";
        System.out.println("Выграла команда - " + winnerName);
    }
}
