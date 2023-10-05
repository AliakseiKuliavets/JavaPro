package practice.javaPro.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentInfo {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 'm', 22, 3, 8.3);
        Student st2 = new Student("Nikolay", 'm', 28, 2, 6.4);
        Student st3 = new Student("Elena", 'f', 19, 1, 8.9);
        Student st4 = new Student("Petr", 'm', 35, 4, 7);
        Student st5 = new Student("Maria", 'f', 23, 3, 9.1);
        List<Student> studentList = Arrays.asList(st1, st2, st3, st4, st5);

        StudentInfo studentInfo = new StudentInfo();
//        studentInfo.testStudents(studentList, new CheckOverGrade());


//        System.out.println("----------------------------------------------");
//        studentInfo.testStudents(studentList, (Student s) -> {
//            return s.getAge() < 30;
//        });
//        System.out.println("----------------------------------------------");
//        studentInfo.testStudents(studentList, (Student s) -> {
//            return s.getAvgGrade() > 8;
//        });
//        System.out.println("----------------------------------------------");
//        studentInfo.testStudents(studentList, (Student s) -> {
//            return s.getAge() < 25 && s.getAvgGrade() > 8 && s.getSex() == 'f';
//        });
//        System.out.println("----------------------------------------------");
//        studentInfo.testStudents(studentList, s -> s.getAvgGrade() < 8);
//        System.out.println("----------------------------------------------");
//        studentInfo.testStudents(studentList, s -> {
//            return s.getAvgGrade() < 8;
//        });
//        System.out.println("----------------------------------------------");
//        StudentChecks sc = (Student p) -> {return p.getAvgGrade() >8;};
//        studentInfo.testStudents(studentList,sc);
//        System.out.println("----------------------------------------------");
        Collections.sort(studentList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getCourse() - o2.getCourse();
            }
        });
        System.out.println(studentList);
        Collections.sort(studentList,(el1, el2) -> el1.getCourse() - el2.getCourse());
        System.out.println(studentList);

    }

    void testStudents(List<Student> arList, StudentChecks sc) {
        for (Student s : arList) {
            if (sc.check(s)) {
                System.out.println(s);
            }
        }
    }
}

@FunctionalInterface
interface StudentChecks {
    boolean check(Student s);
}

class CheckOverGrade implements StudentChecks {
    @Override
    public boolean check(Student s) {
        return s.getAvgGrade() > 8;
    }
}
