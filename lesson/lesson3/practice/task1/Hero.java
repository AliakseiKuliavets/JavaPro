package lesson.lesson3.practice.task1;

public abstract class Hero {
    private int Attack;
    private int Healt;

    public Hero(int attack, int healt) {
        Attack = attack;
        Healt = healt;
    }

    @Override
    public String toString() {
        return "Hero{" +
                "Attack=" + Attack +
                ", Healt=" + Healt +
                '}';
    }
}
