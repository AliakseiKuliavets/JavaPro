package lesson.lesson30.dryKissYagni;//package PROF.dryKissYagni;

//
//import java.util.List;
//
//// Нарушение DRY: Дублирование кода
//public class DataProcessor {
//    public void processData(List<Integer> data) {
//        int sum = 0;
//        for (int num : data) {
//            sum += num;
//        }
//        System.out.println("Sum: " + sum);
//
//        double average = (double) sum / data.size();
//        System.out.println("Average: " + average);
//    }
//
//    public void processUserData(List<User> users) {
//        int totalAge = 0;
//        for (User user : users) {
//            //00.totalAge += user.getAge();
//        }
//        System.out.println("Total Age: " + totalAge);
//
//        double averageAge = (double) totalAge / users.size();
//        System.out.println("Average Age: " + averageAge);
//    }
//}
//class Data {
//    public void processData(List<?> data) {
//        int sum = 0;
//        for (Object object : data) {
//            if (object.getClass().equals(Integer.class)) {
//                sum += (Integer) object;
//            }
//            if (object.getClass().equals(User.class)) {
//                sum += object.getAge();
//            }
//        }
//        System.out.println("Sum: " + sum);
//
//        double average = (double) sum / data.size();
//        System.out.println("Average: " + average);
//    }
//}