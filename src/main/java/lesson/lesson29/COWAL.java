package lesson.lesson29;

import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.ReentrantLock;

public class COWAL {
    private double balance;
    private final ReentrantLock reentrantLock = new ReentrantLock();

    public COWAL(double balance) {
        this.balance = balance;
    }

    public void depsoit(double amount) {
        reentrantLock.lock();
        balance += balance + amount;
        reentrantLock.unlock();
    }
}
