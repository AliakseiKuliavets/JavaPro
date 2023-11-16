package summarySession.friday161123.framework;

import org.reflections.Reflections;
import summarySession.friday161123.framework.annotations.AutoSet;
import summarySession.friday161123.framework.annotations.DataBase;
import summarySession.friday161123.framework.annotations.Service;
import summarySession.friday161123.framework.interfaces.AppService;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Framework {
    private static Reflections reflections;
    private static Set<Object> dataBases;
    private static Set<Object> services;

    public static void run(Class<?> appClass) {
        Package parrentPackage = appClass.getPackage();
        reflections = new Reflections(parrentPackage.getName());

        dataBases = getAnnotationsInstances(DataBase.class);
        services = getAnnotationsInstances(Service.class);

        setDataBasesToServices();

        work();
    }

    private static Set<Object> getAnnotationsInstances(Class<? extends Annotation> annotation) {
        Set<Class<?>> dbClasses = reflections.getTypesAnnotatedWith(annotation);
        Set<Object> result = new HashSet<>();
        try {
            for (Class<?> dbclass : dbClasses) {
                Object object = dbclass.getDeclaredConstructor().newInstance();
                result.add(object);
            }
        } catch (Exception e) {
            System.out.println("Не удалось создать объект");
        }
        return result;
    }

    private static void setDataBasesToServices() {
        for (Object service : services) {
            Field[] fields = service.getClass().getDeclaredFields();
            for (Field field : fields) {
                if (field.isAnnotationPresent(AutoSet.class)) {
                    Class<?> classType = field.getType();
                    for (Object database : dataBases) {
                        if (database.getClass().equals(classType)) {
                            field.setAccessible(true);
                            try {
                                field.set(service, database);
                            } catch (IllegalAccessException e) {
                                System.out.println("Не удалось добавить в Set а далее в базу данных в сервис");
                            }
                        }
                    }
                }
            }
        }
    }

    private static void work() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Введите запрос или exit для выхода");
            String reg = scanner.nextLine().toLowerCase();
            if (reg.equals("exit")) {
                return;
            }
            String[] reqArr = reg.split(" ");
            String type = reqArr[0];
            AppService service = getService(type);
            if (service != null) {
                if (reqArr[1].equals("all")) {
                    service.printAll();
                } else {
                    service.printOne(Integer.parseInt(reqArr[1]));
                }
            } else {
                System.out.println("Неверный запрос , такого сервиса нет");
            }
        }
    }

    private static AppService getService(String type) {
        for (Object service : services) {
            if (service.getClass().getSimpleName().toLowerCase().startsWith(type)) {
                return (AppService) service;
            }
        }
        return null;
    }
}
