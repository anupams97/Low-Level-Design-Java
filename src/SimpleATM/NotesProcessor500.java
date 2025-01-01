package SimpleATM;

public class NotesProcessor500 extends NotesProcessor {

    NotesProcessor500(NotesProcessor nextNotesProcessor) {
        super(nextNotesProcessor);
    }
    public void getNotes(int amount){
        System.out.println("NotesProcessor500.getNotes(500)"+ amount);
        while(amount >= 500){
            note500++;
            amount -= 500;
        }
        super.getNotes(amount);
    }
}
