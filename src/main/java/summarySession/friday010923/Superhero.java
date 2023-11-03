package summarySession.friday010923;

import lombok.Getter;

@Getter
public class Superhero {
    private final String name;
    private final double health;
    private final double force;
    Weapon weapon;

    public Superhero(String name, double health, double force, Weapon weapon) {
        this.name = name;
        this.health = health;
        this.force = force;
        this.weapon = weapon;
    }

    @Override
    public String toString() {
        return "Superhero {" +
                "name='" + name + '\'' +
                ", health=" + health +
                ", force=" + force +
                ", weapon=" + weapon +
                '}';
    }
}
