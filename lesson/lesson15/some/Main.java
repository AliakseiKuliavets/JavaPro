package lesson.lesson15.some;

public class Main {
    public static void main(String[] args) {
        Pupil p1 = new Pupil("Anton", 14);
        Pupil p2 = new Pupil("Kirill", 13);

        TeenAger t1 = new TeenAger("Nikolay", 18);
        TeenAger t2 = new TeenAger("Vasily", 18);

        Adult a1 = new Adult("Alex" , 22);
        Adult a2 = new Adult("Ivan" , 23);

        Team<Pupil> scTeam1 = new Team<>("Robot");
        Team<Pupil> scTeam2 = new Team<>("It");

        scTeam1.addNewParticipant(p1);
        scTeam1.addNewParticipant(p2);

//        scTeam2.addNewParticipant(t1);
//        scTeam2.addNewParticipant(t2);

        scTeam1.play(scTeam2);
    }
}
