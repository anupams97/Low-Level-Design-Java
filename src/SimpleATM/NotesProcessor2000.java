package SimpleATM;

public class NotesProcessor2000 extends NotesProcessor {

    NotesProcessor2000(NotesProcessor nextNotesProcessor) {
        super(nextNotesProcessor);
    }
    public void getNotes(int amount){
        System.out.println("NotesProcessor2000.getNotes(2000)"+ amount);
        while(amount >= 2000){
            note2000++;
            amount -= 2000;
        }
        super.getNotes(amount);
    }
}
