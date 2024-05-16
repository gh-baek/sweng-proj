public class NoteKing {
    private static NoteKing instance;

    private NoteKing() {}

    public static NoteKing getInstance() {
        if (instance == null) {
            instance = new NoteKing();
        }
        return instance;
    }
}