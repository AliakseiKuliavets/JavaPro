package lesson.lesson15.some;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Team {
    private String name;
    private List<Participant> participants = new ArrayList<>();
    private static final Random RANDOM = new Random();

    public Team(String name) {
        this.name = name;
    }
    public void addNewParticipant(Participant newParticipant){
        participants.add(newParticipant);
        System.out.println("New participant was added to the team: " + name);
    }
    public void play(Team team){
        int r = RANDOM.nextInt(2);
        System.out.println("WINNER NAME: " + (r == 0 ? this.name : team.name));
    }
}
