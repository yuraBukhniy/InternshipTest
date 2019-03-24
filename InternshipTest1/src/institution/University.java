package institution;

import person.Student;
import java.util.ArrayList;

public class University {
    String name;
    ArrayList<Student> students = new ArrayList<Student>();
    public int numOfStud; //к-сть студентів

    public University(String name) {
        this.name = name;
    }

    public void addStudent(Student student) {
        students.add(student);
        numOfStud = students.size();
    }

    public Student getStudent(int index) {
        return students.get(index);
    }
}
