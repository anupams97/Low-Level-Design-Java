package VisitorDesignPattern;

public interface IElement {
    public void accept(IVisitor v);
}
