package BuilderPattern;

public class Main {
    public static void main(String[] args){
        Director d = new Director(new CsStudentBuilder());
        Student s = d.createStudent();
        System.out.println(s);
    }
}
