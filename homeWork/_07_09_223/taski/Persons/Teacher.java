package homeWork._07_09_223.taski.Persons;


import homeWork._07_09_223.taski.enums.Grade;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class Teacher extends Person{

    private String teacherGrade;

    public Teacher(String namePerson, int agePeron) {
        super(namePerson, agePeron);
    }

    public String gradeStudent(){
        Grade[] myGrade = {Grade.A, Grade.B, Grade.C, Grade.D, Grade.F};
        int n = (int)Math.floor(Math.random() * myGrade.length);
        return teacherGrade = String.valueOf(myGrade[n]);
    }
    @Override
    public  String getDescription() {
        return "Name teacher " + getNamePerson() + ", age teacher " + getAgePeron() + ", teacher Grade " + teacherGrade;
    }
}
