package lesson.lesson23.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Main1 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class empClass = Class.forName("lesson.lesson23.reflect.Emp");

        Constructor<Emp> constructor1 = empClass.getConstructor(int.class, String.class, String.class);
//        Emp emp = constructor1.newInstance();

        Constructor<Emp> constructor2 = empClass.getConstructor(int.class, String.class, String.class);
        Object object = constructor2.newInstance(11,"Bryan","IT");

//        System.out.println(emp);
        System.out.println(object);


    }
}
