public class Participant {
    // Fields
    private String name;
    private int speakingTime;
    private boolean toggleState;

    // Constructor
    public Participant(String name) {
        this.name = name;
        this.speakingTime = 0;
        this.toggleState = false;
    }

    // Methods
    public void addSpeakingTime(int time) {
        // 메서드 원형
    }

    public void toggleParticipant() {
        // 메서드 원형
    }

    public boolean isToggled() {
        return toggleState;
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getSpeakingTime() {
        return speakingTime;
    }

    public boolean getToggleState() {
        return toggleState;
    }
}
