package BuilderPattern;

import java.util.List;

public abstract class StudentBuilder {
        int rollNumber;
        String name;
        List<String> subjects;
        String mothersName;

        public StudentBuilder setRollNumber(int rollNumber){
            this.rollNumber = rollNumber;
            return this;
        }
      public StudentBuilder setName(String name){
        this.name = name;
        return this;
    }
    public StudentBuilder setMothersName(String name){
        this.mothersName = name;
        return this;
    }
    public abstract  StudentBuilder setSubjects();

        public Student build(){
            return new Student(this);
        }
}
