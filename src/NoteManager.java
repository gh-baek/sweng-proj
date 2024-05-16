import java.util.Date;
import java.util.List;

public class NoteManager {
    String noteId;
    Note note;
    User author;
    Summary summary;
    List<Memo> memos;
    Date createdDate;
    Date lastModifiedDate;
    List<Highlight> highlights;

    void setNote() {}
    Note getNote() { return null; }
    void addMemo() {}
    void deleteMemo() {}
    void addHighlight() {}
    void removeHighlight() {}
}