package lesson.lesson27.lesson;

public class Restaurant {
    private boolean isReady;

    private int counter;


    public synchronized void cookDish() {
        counter++;
        try {
            Thread.sleep(500);
            System.out.println("Cooking food");
            isReady = true;
            notifyAll();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public synchronized void takeDish() {
        int counter1 = counter / 2;
        while (counter1 != 0) {
            counter1--;
            if (counter1 == 0) {
                isReady = false;
            }
            try {
                Thread.sleep(700);
                System.out.println("Waiter is working: " + Thread.currentThread().getName());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        while (isReady) {
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class Cook extends Thread {
    private Restaurant restaurant;

    public Cook(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    @Override
    public void run() {
        for (int i = 0; i < 6; i++) {
            restaurant.cookDish();
        }
    }
}

class Waiter extends Thread {
    private Restaurant restaurant;

    public Waiter(Restaurant restaurant) {
        this.restaurant = restaurant;
    }

    @Override
    public void run() {
        restaurant.takeDish();
    }
}

class Main {
    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();
        Cook cook = new Cook(restaurant);

        Waiter waiter1 = new Waiter(restaurant);
        waiter1.setName("Официант 1");
        Waiter waiter2 = new Waiter(restaurant);
        waiter2.setName("Официант 2");

        cook.start();
        waiter1.start();
        waiter2.start();
    }
}