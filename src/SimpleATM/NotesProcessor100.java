package SimpleATM;

public class NotesProcessor100 extends NotesProcessor {

    NotesProcessor100(NotesProcessor nextNotesProcessor) {
        super(nextNotesProcessor);
    }
    public void getNotes(int amount){
        System.out.println("NotesProcessor100.getNotes(100)"+ amount);
        while(amount >= 100){

            note100++;
            amount -= 100;
        }
        super.getNotes(amount);
    }
}
