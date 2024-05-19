public abstract class Content {
    protected Object content;

    public Content(Object content) {
        this.content = content;
    }

    public abstract void showContent();
}