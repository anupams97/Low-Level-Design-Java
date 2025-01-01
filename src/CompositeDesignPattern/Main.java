package CompositeDesignPattern;



public class Main {
    public static void main(String[] args) {
        Directory root = new Directory("root");
        root.add(new File("file.txt"));
        root.add(new Directory("dir"));
        root.add(new File("dir/file.txt"));
        root.ls();


    }
}
