package lesson.lesson3.task1;

public abstract class Shape {
    private double Area;
    abstract double Area();

    public double setArea(double area) {
        Area = area;
        return area;
    }

    public double getArea() {
        return Area;
    }
}
