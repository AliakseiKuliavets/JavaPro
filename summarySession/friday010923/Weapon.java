package summarySession.friday010923;

import lombok.Getter;

@Getter
public class Weapon  {
    private final String name;
    private final double force;

    public Weapon(String name, double force) {
        this.name = name;
        this.force = force;
    }

    @Override
    public String toString() {
        return "Weapon{" +
                "name='" + name + '\'' +
                ", force=" + force +
                '}';
    }
}
