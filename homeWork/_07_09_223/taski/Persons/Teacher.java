package homeWork._07_09_223.taski.Persons;


import homeWork._07_09_223.taski.enums.Grade;
import lombok.Setter;

@Setter
public class Teacher extends Person{

    private String teacherGrade;

    public Teacher(String namePerson, int agePeron) {
        super(namePerson, agePeron);
    }

    private void gradeStudent(){
        Grade[] myGrade = {Grade.A, Grade.B, Grade.C, Grade.D, Grade.F};
        int n = (int)Math.floor(Math.random() * myGrade.length);
        teacherGrade = String.valueOf(myGrade[n]);
    }
    public void getGradeStudent(){
        gradeStudent();
    }
    @Override
    protected void getDescription() {
        System.out.println("Name teacher " + getNamePerson() + ", age teacher " + getAgePeron());
    }
}
