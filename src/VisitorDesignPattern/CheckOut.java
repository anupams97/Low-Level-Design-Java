package VisitorDesignPattern;

public class CheckOut implements IVisitor{
    @Override
    public void visit(SingleRoom e) {
        e.setStatus("Empty");
    }
}
