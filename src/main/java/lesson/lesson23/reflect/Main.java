package lesson.lesson23.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, NoSuchMethodException {
        Class empClass = Class.forName(
                "lesson.lesson23.reflect.Emp"
        );

        Field field = empClass.getField("id");
        System.out.println("Field type: " + field.getType());
        System.out.println("//////////////////////////////////////////////////");

        Field[] fields = empClass.getFields();
        for (Field f: fields){
            System.out.println("Type: " + f.getType() + " : " + "Name: " + f.getName());
        }
        System.out.println("//////////////////////////////////////////////////");

        Field[] allFields = empClass.getDeclaredFields();
        for (Field f: allFields){
            System.out.println("Type---->: " + f.getType() + " : " + "Name---->: " + f.getName());
        }
        System.out.println("//////////////////////////////////////////////////");


        Method method = empClass.getMethod("increase");
        System.out.println("Methods return Type: " + method.getReturnType());


    }
}
