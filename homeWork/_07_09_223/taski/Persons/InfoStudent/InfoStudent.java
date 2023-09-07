package homeWork._07_09_223.taski.Persons.InfoStudent;

import homeWork._07_09_223.taski.Persons.Person;

public class InfoStudent {
    private Person person;
    private Student student;

    public void infoStudents() {
        System.out.println("Name student " + person.getNamePerson() + ", age student " + person.getAgePeron() + ", grade Student " + student.getGrade());
    }
}
