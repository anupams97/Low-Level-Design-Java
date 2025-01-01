package VisitorDesignPattern;

public class Client {
    public static void main(String[] args) {
        SingleRoom s = new SingleRoom();
        DisplayStatus d = new DisplayStatus();
        d.visit(s);

        CheckIn ci = new CheckIn();
        ci.visit(s);
        d.visit(s);

        CheckOut co = new CheckOut();
        co.visit(s);
        d.visit(s);
    }
}
