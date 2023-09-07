package homeWork._07_09_223.taski.Persons.InfoStudent;

import homeWork._07_09_223.taski.Persons.Person;
import homeWork._07_09_223.taski.enums.Grade;
import homeWork._07_09_223.taski.interfac.Graded;
import lombok.Getter;

@Getter
public class Student extends Person implements Graded {

    private Grade grade;

    public Student(String namePerson, int agePeron) {
        super(namePerson, agePeron);
    }


    @Override
    public void getDescription() {
        System.out.println("Name student " + getNamePerson() + ", age student " + getAgePeron() + ", grade Student " + grade);
    }

}
