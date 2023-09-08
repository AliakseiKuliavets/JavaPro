package homeWork._07_09_223.taski.Persons;

import homeWork._07_09_223.taski.enums.Grade;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Teacher extends Person {

    private Grade teacherGrade;

    public Teacher(String namePerson, int agePeron) {
        super(namePerson, agePeron);
    }

    // метод для рандомного выставления оценок
    public void gradeStudent(Student student) {
        Grade[] myGrade = {Grade.A, Grade.B, Grade.C, Grade.D, Grade.F};
        int n = (int) (Math.random() * myGrade.length);
        // присваиваю через setGrade оценку студенту
        student.setGrade(myGrade[n]);
    }

    @Override
    public String getDescription() {
        return " { Name teacher " + getNamePerson() + ", age teacher " + getAgePeron() + " } ";
    }
}
