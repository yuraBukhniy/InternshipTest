package person;

import person.consciousness.Knowledge;

public class Student {
    int knowledge;
    String name;

    public Student(String name) {
        this.name = name;
    }

    public void setKnowledge(Knowledge knowledge) {
        this.knowledge = knowledge.getLevel();
    }

    public int getKnowledge() {
        return knowledge;
    }

    public String getName() {
        return name;
    }
}
