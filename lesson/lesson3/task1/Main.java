package lesson.lesson3.task1;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        circle.resize(1.5);
        System.out.println("Circle area after resizing: " + circle.Area());

        Rectangle rectangle = new Rectangle(4, 6);
        rectangle.resize(2);
        System.out.println("Rectangle area after resizing: " + rectangle.Area());
    }
}
