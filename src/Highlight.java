public abstract class Highlight implements Observer{
    protected int startPosition;
    protected int endPosition;
    protected String color;
    protected String text;

    // 생성자
    public Highlight(int startPosition, int endPosition, String color, String text) {
        this.startPosition = startPosition;
        this.endPosition = endPosition;
        this.color = color;
        this.text = text;
    }
    
    // Highlight를 추가하는 추상 메소드
    abstract void addHighlight(Highlight highlight);

    // Highlight를 제거하는 추상 메소드
    abstract boolean removeHighlight(int index);

    // 특정 Highlight 정보를 가져오는 추상 메소드
    abstract Highlight getHighlight(int index);

    @Override
    public abstract void update(Note newNote);
}