import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

// Observer : NoteManager(Pub) - Highlight, Summary (Sub)
// Note 내용 변경 시 update
// State: NoteManager -> Public, Private
// 권한 부여된 사용자 수에 따라 state 변경
public class NoteManager {
    // Note와 Note의 메타데이터를 관리하는 클래스
    private String noteUrl;
    private Note note;
    private String author;

    private LocalDate createdDate;
    private LocalDate lastModifiedDate;
    private List<Memo> memos;
    private List<Highlight> highlights;
    private Summary summary;
    private NoteState noteState;
    private List<String> authUsers;

    private List<Observer> observers;

    public NoteManager(String userId, Note note, NoteState state){
        this.noteUrl = getUrl();
        this.note = note;
        this.author = userId;

        this.createdDate = LocalDate.now();
        this.lastModifiedDate = LocalDate.now();

        memos = new ArrayList<>();
        highlights = new ArrayList<>();

        setState(state);
        this.authUsers = new ArrayList<>();
        this.observers = new ArrayList<>();

    }

    private String getUrl() {
        String url = "실제로 구현된다면, 서버로 부터 사용가능한 url 받게 될 예정";
        // NoteServer.setUrl(this);
        // url = NoteServer.getUrl(this);
        return url;
    }
    public Note getNote() {
        return this.note;
    }
    public LocalDate getCreatedDate() {
        return this.createdDate;
    }
    void addMemo(Memo memo) {
        memos.add(memo);
        lastModifiedDate = LocalDate.now();

    }
    void deleteMemo(Memo memo) {
        memos.remove(memo);
        lastModifiedDate = LocalDate.now();

    }
    void addHighlight(Highlight highlight) {
        highlights.add(highlight);
        attach(highlight);
        lastModifiedDate = LocalDate.now();

    }
    void removeHighlight(Highlight highlight) {
        highlights.remove(highlight);
        detach(highlight);
        lastModifiedDate = LocalDate.now();

    }

    public void addSummary(Summary summary){
        this.summary = summary;
        lastModifiedDate = LocalDate.now();
    }
    // Observer 패턴을 위한 코드
    public void modifyNote(){
        note.modify();
        notifyObservers(this.note);
        lastModifiedDate = LocalDate.now();
    }

    public void attach(Observer observer) {

        observers.add(observer);
    }

    public void detach(Observer observer) {

        observers.remove(observer);
    }

    public void notifyObservers(Note newNote) {
        for (Observer observer : observers) {
            observer.update(newNote);
        }
    }

    // State 패턴을 위한 코드
    public void setState(NoteState state) {
        this.noteState = state;
    }

    public void addAuthUsers(String[] ids) {
        noteState.addAuthUsers(this, ids);
        lastModifiedDate = LocalDate.now();
    }

    public void setAuthUsers(String[] ids){
        authUsers.addAll(Arrays.asList(ids));
    }
}