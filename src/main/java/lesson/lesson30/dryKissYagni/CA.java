package lesson.lesson30.dryKissYagni;

public class CA {
    // Нарушение CODE SMELLS: Магические числа
    public double calculateArea(int shapeType, double... params) {
        if (shapeType == 1) { // 1 - круг
            double radius = params[0];
            return Math.PI * radius * radius;
        } else if (shapeType == 2) { // 2 - квадрат
            double side = params[0];
            return side * side;
        } else if (shapeType == 3) { // 3 - треугольник
            double a = params[0];
            double b = params[1];
            double c = params[2];
            double s = (a + b + c) / 2;
            return Math.sqrt(s * (s - a) * (s - b) * (s - c));
        }
        return 0.0;
    }
}

// Исправлено:
// Заменили магические числа на константы и создали отдельные методы для каждой фигуры.
class CalculatorI {
    public static final int CIRCLE = 1;
    public static final int SQUARE = 2;
    public static final int TRIANGLE = 3;

    public double calculateArea(int shapeType, double... params) {
        if (shapeType == CIRCLE) {
            return calculateCircleArea(params[0]);
        } else if (shapeType == SQUARE) {
            return calculateSquareArea(params[0]);
        } else if (shapeType == TRIANGLE) {
            return calculateTriangleArea(params[0], params[1], params[2]);
        }
        return 0.0;
    }

    private double calculateCircleArea(double radius) {
        return Math.PI * radius * radius;
    }

    private double calculateSquareArea(double side) {
        return side * side;
    }

    private double calculateTriangleArea(double a, double b, double c) {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
}