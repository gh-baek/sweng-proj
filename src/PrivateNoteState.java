import java.util.Arrays;

public class PrivateNoteState implements NoteState{

    @Override
    public void addAuthUsers(NoteManager noteManager, String[] ids) {
        System.out.println("Cannot add user " + Arrays.toString(ids) + ". Sharing is not allowed in private state.");
    }
}
