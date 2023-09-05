package lesson.lesson3.task1;

import lesson.lesson3.task1.interfac.Resizable;

public class Circle extends Shape implements Resizable {
    private final int radius;
    private final double PI = Math.PI;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public void resize(double factor) {
        double result = Area() * factor;
        setArea(result);
    }

    @Override
    double Area() {
        if (getArea() == 0) {
            return PI * (radius * radius);
        } else {
            return getArea();
        }
    }
}
