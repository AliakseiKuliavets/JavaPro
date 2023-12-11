package lesson.lesson30.dryKissYagni;

public class CircleQ {
    private double radius;
    
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
    
    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }
}

class CircleQ1 {
    private double radius;

    public CircleQ1(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    public double getRadius() {
        return radius;
    }
}