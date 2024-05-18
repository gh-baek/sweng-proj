import java.util.*;

public class HighlightImpl extends Highlight {
	private List<Highlight> highlights;

    public HighlightImpl() {
        super(0, 0, null, null);
        this.highlights = new ArrayList<>();
    }

    @Override 
    void addHighlight(Highlight highlight) {
        highlights.add(highlight);
    }

    @Override
    boolean removeHighlight(int index) {
        if (index >= 0 && index < highlights.size()) {
            highlights.remove(index);
            return true;
        }
        return false;
    }

    @Override
    Highlight getHighlight(int index) {
        if (index >= 0 && index < highlights.size()) {
            return highlights.get(index);
        }
        return null;
    }
}