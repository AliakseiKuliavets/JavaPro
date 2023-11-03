package lesson.lesson3.some;

public abstract class Hero {
    private String name;

    public Hero(String name) {
        this.name = name;
    }

    abstract void walk();

    abstract void attack();

    void shot() {
        System.out.println("*****");
    }
}

interface Flyable {
    void fly();
}

class Hero1 extends Hero implements Flyable{

    public Hero1(String name) {
        super(name);
    }

    @Override
    void walk() {
        System.out.println("Hero1 walk");
    }

    @Override
    void attack() {
        System.out.println("Hero1 attack");
    }

    @Override
    public void fly() {
        System.out.println("Hero1 fly");
    }
}

class Hero2 extends Hero {

    public Hero2(String name) {
        super(name);
    }

    @Override
    void walk() {
        System.out.println("Hero2 walk");
    }

    @Override
    void attack() {
        System.out.println("Hero2 attack");
    }
}

