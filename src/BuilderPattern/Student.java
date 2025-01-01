package BuilderPattern;

import java.util.List;

public class Student {
    int rollNumber;
    String name;
    List<String> subjects;
    String mothersName;

    Student(StudentBuilder sb){
        this.rollNumber = sb.rollNumber;
        this.name = sb.name;
        this.subjects = sb.subjects;
        this.mothersName = sb.mothersName;
    }
    public String toString(){
        return "roll no:" + this.rollNumber + " name: "+ this.name + "Subjects: "+ this.subjects;
    }
}
