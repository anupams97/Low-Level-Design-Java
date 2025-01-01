package CompositeDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem {
    String name;
    List<FileSystem> children;
    Directory(String name) {
        this.name = name;
        this.children = new ArrayList<>();
    }
    public void ls(){
        System.out.println(name);
        for(FileSystem child : children){
            child.ls();
        }
        
    }
    public void add(FileSystem fileSystem){
        children.add(fileSystem);
    }
}
