package VisitorDesignPattern;

public class CheckIn implements IVisitor{
    @Override
    public void visit(SingleRoom e) {
        e.setStatus("Occupied");
    }
}
