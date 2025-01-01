package PrototypeDesignPattern;

public class Main {
    public static void main(String[] args) {
        Student a = new Student(1,"anupam",12);
        System.out.println(a.name);
        Student cloneObj = (Student) a.cloneObj();
        System.out.println(cloneObj.name);
        cloneObj.name ="f";
        System.out.println(cloneObj.name);
        System.out.println(a.name);

    }
}
