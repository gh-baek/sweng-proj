import java.time.LocalDate;
import java.util.Map;

// Singleton 적용
public class Calendar {
    private static Calendar instance;
    private NoteKing noteKing;
    private Map<LocalDate, NoteManager[]> dateNoteMap;

    private Calendar(NoteKing noteKing) {
        this.noteKing = noteKing;
        setDateNoteMap();
    }

    public static Calendar getInstance(NoteKing noteKing) {
        if (instance == null) {
            instance = new Calendar(noteKing);
        }
        return instance;
    }

    public void setDateNoteMap() {
        dateNoteMap = NoteSorter.sortNotesByDate(noteKing.getNoteManagers());
    }

    public void showCalendar() {
        // Calendar 출력 메서드
        // 현 단계에선 출력만
        System.out.println(dateNoteMap);
    }
}
