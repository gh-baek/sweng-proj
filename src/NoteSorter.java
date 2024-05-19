import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;

public class NoteSorter {

    public static Map<LocalDate, NoteManager[]> sortNotesByDate(List<NoteManager> notes) {
        // 정렬된 맵을 저장할 변수
        Map<LocalDate, List<NoteManager>> sortedMap = new HashMap<>();

        // NoteManager 배열을 순회하여 createdDate 기준으로 맵에 추가
        for (NoteManager note : notes) {
            LocalDate createdDate = java.sql.Date.valueOf(note.getCreatedDate()).toLocalDate();
            sortedMap.putIfAbsent(createdDate, new ArrayList<>());
            sortedMap.get(createdDate).add(note);
        }

        Map<LocalDate, NoteManager[]> resultMap = sortedMap.entrySet().stream()
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        entry -> entry.getValue().toArray(new NoteManager[0])
                ));

        return resultMap;
    }
}
