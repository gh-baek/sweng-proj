import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ParticipantManager {
    // Fields
    private List<Participant> participants;

    // Constructor
    public ParticipantManager() {
        this.participants = new ArrayList<>();
    }

    // Methods
    public void addParticipant(Participant participant) {
        // 메서드 원형
    }

    public void updateSpeakingTime(String name, int time) {
        // 메서드 원형
    }

    public void toggleParticipant(String name) {
        // 메서드 원형
    }

    public Map<String, Float> calculateParticipationRates() {
        return new HashMap<>();
    }

    // Getters
    public List<Participant> getParticipants() {
        return participants;
    }
}
