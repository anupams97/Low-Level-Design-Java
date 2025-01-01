package HeadFirstDesignPatterns.TemplatePattern;

public class Tea extends Beverage {
    @Override
    public void addCondiments() {
        System.out.println("Add Lemon");
    }

    @Override
    public void brew() {
        System.out.println("Brew Tea");
    }
}
