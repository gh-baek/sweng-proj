import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ParticipantManager {
    private List<Participant> participants;

    public ParticipantManager() {
        this.participants = new ArrayList<>();
    }

    public Map<Participant, Double> calculateDiscussionShare(List<Note> notes) {
        Map<Participant, Double> discussionShare = new HashMap<>();
        // 대화 점유율 구하기
        return discussionShare;
    }

    public void toggleParticipantVisibility(Note note) {
    }
}