public class LoadStrategy implements CreateStrategy{

    @Override
    public NoteManager createNoteManager(String userId, NoteState state){
        Note note = new Note();
        //로컬에 저장되어 있는 Note의 실제 파일을 불러와 생성하는 과정
        // note = LoadFile...;
        return new NoteManager(userId, note,state);
    }
}
