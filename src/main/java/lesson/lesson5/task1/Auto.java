package lesson.lesson5.task1;

import lombok.Getter;

import java.util.Objects;

@Getter
public class Auto implements Comparable<Auto> {
    private final String name;
    private final boolean isTwoDoors;
    private final double horsePower;

    public Auto(String name, boolean isTwoDoors, double horsePower) {
        this.name = name;
        this.isTwoDoors = isTwoDoors;
        this.horsePower = horsePower;
    }

    @Override
    public int compareTo(Auto o) {
        return (int) (this.horsePower - o.horsePower);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Auto auto = (Auto) o;
        return Double.compare(auto.horsePower, horsePower) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(horsePower);
    }
}
