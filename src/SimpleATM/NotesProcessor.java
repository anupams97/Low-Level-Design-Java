package SimpleATM;

public class NotesProcessor {
    public static int note100 = 0;
    public static int note200 = 0;
    public static int note500 = 0;
    public static int note2000 = 0;

    NotesProcessor nextNoteProcessor;

    NotesProcessor(NotesProcessor nextNoteProcessor){
        this.nextNoteProcessor = nextNoteProcessor;
    }
    public void getNotes(int amount){
        if(nextNoteProcessor != null){
            nextNoteProcessor.getNotes(amount);
        }
    }
}
