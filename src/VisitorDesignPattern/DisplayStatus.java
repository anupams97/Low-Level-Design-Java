package VisitorDesignPattern;

public class DisplayStatus implements IVisitor{
    @Override
    public void visit(SingleRoom e) {
        System.out.printf("Room status :%s\n", e.getStatus());
    }
}
