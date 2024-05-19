import java.util.Map;

public class VoiceContent extends Content {
    private ParticipantManager participants;
    private Map<Double, String> discussionShare;

    public VoiceContent(Object content) {
        super(content);
    }

    @Override
    public void showContent() {
    }

    public Content convertVoc2Txt() {
        return null;
    }
}