public class Summary {
	protected String text;
	protected String summaryText;
	protected int numSentences;
	
	public Summary(String text) {
		this.text = text;
		this.numSentences = text.split("[.?!]").length / 3; // 기본값: 문장 수의 1/3
	}
	
	public abstract void summarize();
	
	public void setNumSentences(int numSentences) {
        this.numSentences = numSentences;
    }
}