package lesson.lesson3.some;

public abstract class Beverage {
    abstract void consume();
}

class Tea extends  Beverage {

    @Override
    void consume() {
        System.out.println("Tea");
    }
}
class Coffee extends  Beverage{

    @Override
    void consume() {
        System.out.println("Coffee");
    }
}

class Main {
    public static void main(String[] args) {
        Beverage tea = new Tea();
        tea.consume();

        Beverage coffee = new Coffee();
        coffee.consume();
    }
}
