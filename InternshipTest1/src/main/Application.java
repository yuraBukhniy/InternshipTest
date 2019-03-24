package main;

import institution.University;
import institution.interlink.Internship;
import person.Student;
import person.consciousness.Knowledge;
import java.io.*;

public class Application {

    public static void main(String[] args) {
        University university = new University("CH.U.I.");

        //зчитування списку студентів з файлу
        try {
            File file = new File("Names.txt");
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) { //зчит. рядок з файлу
                String[] nameAndKnowl = line.split(":"); //розбиваємо його на ім'я студента і його рівень знань
                Student st = new Student(nameAndKnowl[0]);
                st.setKnowledge(new Knowledge(Integer.parseInt(nameAndKnowl[1])));
                university.addStudent(st);
            }
            bufferedReader.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        /*university.addStudent(new Student("Andrew Kostenko"));
        university.addStudent(new Student("Julia Veselkina"));
        university.addStudent(new Student("Maria Perechrest"));*/

        Internship internship = new Internship("Interlink");
        //додаємо студентів до інтернатури
        for(int i=0; i<university.numOfStud; i++){
            internship.setStudent(university.getStudent(i));
        }

        System.out.println("List of internship's students:");
        System.out.println(internship.getStudents());
    }

}
