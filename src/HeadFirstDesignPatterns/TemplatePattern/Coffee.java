package HeadFirstDesignPatterns.TemplatePattern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Coffee extends Beverage{
    @Override
    public void addCondiments() {
        System.out.println("Add Sugar and coffee powder");
    }

    @Override
    public void brew() {
        System.out.println("Brewing Coffee");
    }
    public boolean wantCondimentHook(){
        String input = getUserInput();
        return input.toLowerCase().startsWith("y");
    }
    private String getUserInput(){
        String ans = null;
        BufferedReader b= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Do you want to add condiment?");
        try{
            ans=b.readLine();
        }catch(IOException ioe){
            System.out.println("Error IO");
        }
        if (ans==null) return "no";
        return ans;
    }
}
