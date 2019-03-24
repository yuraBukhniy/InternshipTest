package institution.interlink;

import person.Student;
import person.consciousness.Knowledge;
import java.util.ArrayList;

public class Internship {
    String name;
    ArrayList<Student> studentsOfInternship = new ArrayList<Student>();

    public Internship(String name) {
        this.name = name;
    }

    public void setStudent(Student student) {
        //відбираємо тільки тих студентів рівень знань яких вище середнього
        if(student.getKnowledge() > Knowledge.AVG_LEVEL) {
            studentsOfInternship.add(student);
        }
    }

    public String getStudents() {
        String names = "";
        for(Student stud: studentsOfInternship) {
            //виводимо імена студентів інтернатури і рівень їх знань
            names += stud.getName() + "(" + stud.getKnowledge() + ")\n";
        }
        return names;
    }
}
