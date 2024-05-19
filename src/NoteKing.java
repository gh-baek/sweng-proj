import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Singleton 적용
public class NoteKing {

    private static NoteKing instance;
    private List<NoteManager> noteManagers;

    // 사용자가 설정한 해당 노트의 카테고리와 해당 카테고리에 포함되는 NoteManager 리스트 맵
    private Map<String, List<NoteManager>> noteCategoryListMap;
    private User user;

    private NoteKing(User user) {
        noteManagers = new ArrayList<>();
        noteCategoryListMap = new HashMap<String, List<NoteManager>>();
        this.user = user;
    }

    public static NoteKing getInstance(User user) {
        if (instance == null) {
            instance = new NoteKing(user);
        }
        return instance;
    }

    public List<NoteManager> getNoteManagers(){
        return noteManagers;
    }

    // strategy: 노트 생성 시, Load해서 생성할 지, 새로 Write해서 생성할 지 선택했다 가정
    // state: 노트 생성 시, public 상태인지, private 상태인지 정했다고 가정
    public void createNoteManager(CreateStrategy strategy, NoteState state){
         //Stategy
        // 실제 생성은 notecreator를 통해서
        // notecreator strategy가 load or write
        // state 도 거기서 noteManager에게 전달NoteCreator creator = new NoteCreator(strategy);
        NoteManager noteManager = new NoteCreator(strategy).createNoteManager(user.getUserId(), state);
        noteManagers.add(noteManager);
    }
    public void deleteNoteManager(NoteManager noteManager){
        noteManagers.remove(noteManager);
    }
    public List<NoteManager> getCategoryNotes(String category){
        return noteCategoryListMap.get(category);
    }

}