package BuilderPattern;

public class Director {
    StudentBuilder sb;
    Director(StudentBuilder sb){
        this.sb = sb;
    }

    public Student createStudent(){
        return createCSStudent();
    }
    private Student createCSStudent(){
        return sb.setRollNumber(1).setName("Anupam").setMothersName("Babita").setSubjects().build();
    }
}
