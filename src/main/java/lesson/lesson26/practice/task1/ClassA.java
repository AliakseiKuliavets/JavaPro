package lesson.lesson26.practice.task1;

public class ClassA {
    private ClassB classB;

    public void setClassB(ClassB classB) {
        this.classB = classB;
    }

    public synchronized void methodA() {
        System.out.println("Поток с именем " + Thread.currentThread().getName() + " начал methodA");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        classB.methodD();
        System.out.println("Поток с именем " + Thread.currentThread().getName() + " закончил methodA");
    }

    public synchronized void methodB() {
        System.out.println("Поток с именем " + Thread.currentThread().getName() + " начал methodB");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Поток с именем " + Thread.currentThread().getName() + " закончил methodB");
    }
}
