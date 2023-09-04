package lesson.lesson3.task1;

import lesson.lesson3.task1.interfac.Resizable;

public class Circle extends Shape implements Resizable {
    private final int radius;
    private final double PI = Math.PI;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double resize(double factor) {
        return Area() * factor;
    }

    @Override
    double Area() {
        return PI * (radius * radius);
    }
}
