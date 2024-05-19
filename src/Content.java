public abstract class Content {
    protected Object content;
    protected Content(Object object){
        this.content = object;
    }
    public abstract void showContent();
}
