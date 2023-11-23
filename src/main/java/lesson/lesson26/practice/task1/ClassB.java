package lesson.lesson26.practice.task1;

public class ClassB {
    private ClassA classA;

    public void setClassA(ClassA classA) {
        this.classA = classA;
    }

    public synchronized void methodC() {
        System.out.println("Поток с именем " + Thread.currentThread().getName() + " начал methodC");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        classA.methodB();
        System.out.println("Поток с именем " + Thread.currentThread().getName() + " закончил methodC");
    }

    public synchronized void methodD() {
        System.out.println("Поток с именем " + Thread.currentThread().getName() + " начал methodD");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Поток с именем " + Thread.currentThread().getName() + " закончил methodD");
    }
}
