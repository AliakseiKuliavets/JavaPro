package lesson.lesson26.practice.task1;

public class Main {
    public static void main(String[] args) {
        ClassA classA = new ClassA();
        ClassB classB = new ClassB();
        classA.setClassB(classB);
        classB.setClassA(classA);

        MyThread1 myThread1 = new MyThread1(classA, "Alpha");
        MyThread2 myThread2 = new MyThread2(classB, "Beta");

    }
}

