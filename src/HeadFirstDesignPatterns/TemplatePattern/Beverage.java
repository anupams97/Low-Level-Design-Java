package HeadFirstDesignPatterns.TemplatePattern;

public abstract class Beverage {
    public final void prepareRecipe() {
        boilWater();
        if(wantCondimentHook()){
            addCondiments();
        }
        brew();
        pour();
    }
    public abstract void addCondiments();
    public abstract void brew();
    public void boilWater(){
        System.out.println("Boil Water");
    }
    public void pour(){
        System.out.println("Pour to cup");
    }
    public boolean wantCondimentHook(){
        return true;
    }

}
