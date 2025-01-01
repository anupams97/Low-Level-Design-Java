package PrototypeDesignPattern;

public class Student implements Prototype {
    int rollNo;
    String name;
    int grade;

    Student(int rollNo,String name, int grade){
       this.rollNo = rollNo;
       this.name = name;
       this.grade = grade;
    }

    @Override
    public Prototype cloneObj() {
        return new Student(rollNo, name,grade);
    }
}
