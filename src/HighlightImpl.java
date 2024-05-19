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

    @Override
    public void update(Note newNote) {
        // 새로운 노트의 TextContent 내용을 바탕으로 하이라이트를 갱신

        String newText = newNote.getText();

        // 기존 text에서 startPosition과 endPosition에 해당하는 내용이
        // newText에서 바뀌었다면
        // 기존 하이라이트를 삭제
        List<Highlight> highlightsToRemove = new ArrayList<>();
        for (Highlight highlight : highlights) {
            int start = highlight.startPosition;
            int end = highlight.endPosition;

            if (start < newText.length() && end <= newText.length()) {
                String oldHighlightedText = highlight.text;
                String newHighlightedText = newText.substring(start, end);

                if (!oldHighlightedText.equals(newHighlightedText)) {
                    highlightsToRemove.add(highlight);
                    System.out.println("기존 하이라이트한 내용이 수정되었습니다. 하이라이트를 다시 시행해주세요.");
                }
            } else {
                // If the range is out of the new text length, mark the highlight for removal
                highlightsToRemove.add(highlight);
                System.out.println("기존 하이라이트한 내용이 수정되었습니다. 하이라이트를 다시 시행해주세요.");
            }
        }

        // Remove outdated highlights
        highlights.removeAll(highlightsToRemove);
    }

}