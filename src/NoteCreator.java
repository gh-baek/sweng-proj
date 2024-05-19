public class NoteCreator {

    CreateStrategy strategy;
    NoteCreator(CreateStrategy strategy){
        this.strategy = strategy;
    }

    public NoteManager createNoteManager(String userId, NoteState state){
        return this.strategy.createNoteManager(userId, state);
    }
}
