import java.util.Map;

public class Participant {
    private String name;
    private Map<Double, String> discussion;

    public Participant(String name, Map<Double, String> discussion) {
        this.name = name;
        this.discussion = discussion;
    }

    public String getName() {
        return name;
    }

    public Map<Double, String> getDiscussion() {
        return discussion;
    }
}
