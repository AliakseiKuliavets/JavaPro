package lesson.lesson27.lesson;

public class Restaurant {
    private boolean isReady = false;

    public synchronized void cookDish() {
        try {
            Thread.sleep(1500);
            System.out.println("Cooking food");
            isReady = true;
            notifyAll();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public synchronized void takeDish() {
        while (!isReady) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        try {
            Thread.sleep(1700);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Waiter is working");
        isReady = false;
    }
}

class Cook extends Thread {
    private Restaurant restaurant;

    public Cook(Restaurant restaurant) {
        super.start();
        this.restaurant = restaurant;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            restaurant.cookDish();
        }
    }
}

class Waiter extends Thread {
    private Restaurant restaurant;

    public Waiter(Restaurant restaurant) {
        super.start();
        this.restaurant = restaurant;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            restaurant.takeDish();
        }
    }
}

class Main {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();
        Cook cook = new Cook(restaurant);

        Waiter waiter1 = new Waiter(restaurant);
        Waiter waiter2 = new Waiter(restaurant);
    }
}