public abstract class Summary implements Observer{
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

	//NoteManager 로부터 notify 시 동작
	//NoteManager 의 Note 내용 변경 시 update
	@Override
	public abstract void update(Note newNote);

}