package SimpleATM;

import Logger.LogProcessor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int amount = scanner.nextInt();
        // Print the input
        System.out.println("You entered: " + amount);
        // Close the scanner
        scanner.close();

        NotesProcessor notesProcessor = new NotesProcessor(
                new NotesProcessor2000(
                        new NotesProcessor500(
                                new NotesProcessor200(
                                        new NotesProcessor100(null)
                                )
                        )
                )
        );
        notesProcessor.getNotes(amount);
        System.out.println(" 2000 notes: "+ NotesProcessor.note2000 +" 500 notes: "+ NotesProcessor.note500+ " 200 notes: "+NotesProcessor.note200 + " 100 notes: "+ NotesProcessor.note100);
    }


}
