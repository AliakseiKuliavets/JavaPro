package lesson.lesson15.some;

public class Main {
    public static void main(String[] args) {
        Pupil p1 = new Pupil("Anton", 14);
        Pupil p2 = new Pupil("Kirill", 13);

        TeenAger t1 = new TeenAger("Nikolay", 18);
        TeenAger t2 = new TeenAger("Vasily", 18);

        Adult a1 = new Adult("Alex" , 22);
        Adult a2 = new Adult("Ivan" , 23);

        Team<TeenAger> pupilTeam1 = new Team<>("Robot");
        Team<TeenAger> pupilTeam2 = new Team<>("It");

        pupilTeam1.addNewParticipant(p1);
        pupilTeam1.addNewParticipant(p2);

        pupilTeam2.addNewParticipant(t1);
        pupilTeam2.addNewParticipant(t2);

        pupilTeam1.play(pupilTeam2);
    }
}
