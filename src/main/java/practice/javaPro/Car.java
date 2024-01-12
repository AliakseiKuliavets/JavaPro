package practice.javaPro;

import java.util.ArrayList;
import java.util.List;

public class Car {
    public static Car getMax(Car[] cars) {
        if (cars == null) {
            throw new RuntimeException("Input array should not be null");
        }
        if (cars.length == 0) {
            throw new IllegalStateException("Bad array size");
        }
        Car car = null;
        int maxSpeed = Integer.MIN_VALUE;
        int maxAcceleration = Integer.MIN_VALUE;
        for (Car value : cars) {
            if (value.maxSpeed == maxSpeed) {
                if (value.acceleration > maxAcceleration) {
                    maxAcceleration = value.acceleration;
                    car = value;
                }
            }
            if (value.maxSpeed > maxSpeed) {
                maxSpeed = value.maxSpeed;
                car = value;
            }
        }
        return car;
    }

    ////DO NOT MODIFY ANYTHING BELOW THIS LINE

    int maxSpeed;
    int acceleration;

    public Car(int maxSpeed, int acceleration) {
        this.maxSpeed = maxSpeed;
        this.acceleration = acceleration;
    }

    @Override
    public String toString() {
        return "Car with maxSpeed=" + maxSpeed + " and acceleration=" + acceleration;
    }

    public int calculate(int index) {
        if (index < 4) {
            return index;
        }
        int n1 = 0;
        int n2 = 1;
        int n3 = 2;
        int n4 = 3;

        int res = 0;

        for (int i = 3; i < index; i++) {
            res = n1 + n2 + n3 + n4;
            n1 = n2;
            n2 = n3;
            n3 = n4;
            n4 = res;

        }
        return res;
    }

    public static void main(String[] args) {
        Car car = new Car(10, 20);
        Car car1 = new Car(10, 25);
        Car car2 = new Car(8, 25);
        Car[] cars = {car, car1, car2};
        System.out.println(getMax(new Car[0]));
    }
}
