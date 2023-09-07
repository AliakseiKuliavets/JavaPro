package homeWork._07_09_223.taski.Persons;

import homeWork._07_09_223.taski.interfac.Graded;
import lombok.Getter;

@Getter
public class Student extends Person implements Graded {

    private final String grade;

    public Student(String namePerson, int agePeron, String teacherGrade) {
        super(namePerson, agePeron);
        this.grade = teacherGrade;
    }


    @Override
    public String getDescription() {
        return "Name student " + getNamePerson() + ", age student " + getAgePeron() + ", grade " + grade;
    }

    @Override
    public String getGrade() {
        return null;
    }
}
