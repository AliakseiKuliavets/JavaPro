package homeWork._07_09_223.taski.Persons;

import homeWork._07_09_223.taski.interfac.Graded;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Student extends Person implements Graded {

    private String grade;

    public Student(String namePerson, int agePeron) {
        super(namePerson, agePeron);
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
