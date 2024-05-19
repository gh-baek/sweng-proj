public class PublicNoteState implements NoteState{

    @Override
    public void addAuthUsers(NoteManager noteManager, String[] ids) {
        System.out.println("Cannot add user " + ids + ". Sharing is not allowed in private state.");
    }
}
