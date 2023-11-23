package lesson.lesson26.practice.task1;

public class MyThread2 extends Thread {
    private ClassB classB;

    public MyThread2(ClassB classB, String name) {
        this.classB = classB;
        setName(name);
        start();
    }

    @Override
    public void run() {
        classB.methodC();
    }
}
