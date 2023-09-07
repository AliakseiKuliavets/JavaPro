package homeWork._07_09_223.taski.Comparator;

import homeWork._07_09_223.taski.Persons.InfoStudent.Student;
import java.util.Comparator;

public class GradeComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getGrade().compareTo(o2.getGrade());
    }
}
