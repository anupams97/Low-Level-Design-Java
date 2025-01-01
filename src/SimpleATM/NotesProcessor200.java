package SimpleATM;

public class NotesProcessor200  extends NotesProcessor{

    NotesProcessor200(NotesProcessor nextNotesProcessor) {
        super(nextNotesProcessor);
    }
    public void getNotes(int amount){
        System.out.println("NotesProcessor200.getNotes(200)"+ amount);
        while(amount >= 200){
            note200++;
            amount -= 200;
        }
        super.getNotes(amount);
    }
}
