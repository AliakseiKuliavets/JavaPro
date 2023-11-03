package lesson.lesson3.task1;

import lesson.lesson3.task1.interfac.Resizable;

public class Rectangle extends Shape implements Resizable {
    private final double sizeA;
    private final double sizeB;

    public Rectangle(double sizeA, double sizeB) {
        this.sizeA = sizeA;
        this.sizeB = sizeB;
    }

    @Override
    public void resize(double factor) {
        double result = Area() * factor;
        setArea(result);
    }

    @Override
    double Area() {
        if (getArea() == 0) {
            return sizeA * sizeB;
        } else {
            return  getArea();
        }
    }
}
