package lesson.lesson3.practice.task2;

public abstract class Hero {
    private int Attack;
    private int Healt;

    public Hero(int attack, int healt) {
        Attack = attack;
        Healt = healt;
    }

    static void money() {
        System.out.println("I have money");
    }

    @Override
    public String toString() {
        return "Hero{" +
                "Attack=" + Attack +
                ", Healt=" + Healt +
                '}';
    }
}
