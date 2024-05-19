import java.util.*;

public class SummaryImpl extends Summary {

	public SummaryImpl(String text) {
	    super(text);
	}
    
    public void summarize() {
        // 텍스트를 문장 단위로 분리
        String[] sentences = text.split("[.?!]");
        if (sentences.length == 0) {
            summaryText = "";
            return;
        }
        
        // 단어별 빈도수 맵 생성
        Map<String, Integer> wordFrequencies = new HashMap<>();
        for (String sentence : sentences) {
            String[] words = sentence.split("\\s+");
            for (String word : words) {
                word = word.toLowerCase();
                if (!wordFrequencies.containsKey(word)) {
                    wordFrequencies.put(word, 1);
                } else {
                    wordFrequencies.put(word, wordFrequencies.get(word) + 1);
                }
            }
        }

        // 빈도수가 높은 단어 순서대로 정렬
        List<String> rankedWords = new ArrayList<>(wordFrequencies.keySet());
        Collections.sort(rankedWords, (word1, word2) -> wordFrequencies.get(word2) - wordFrequencies.get(word1));
        
        // 빈도수가 높은 단어들을 이용하여 요약문 생성
        List<String> summarySentences = new ArrayList<>();
        int sentenceCount = 0;
        for (String sentence : sentences) {
            int wordCount = 0;
            for (String word : rankedWords) {
                if (sentence.toLowerCase().contains(word)) {
                    wordCount++;
                }
            }
            if (wordCount > 0 && sentenceCount < numSentences) {
                summarySentences.add(sentence.trim());
                sentenceCount++;
            }
        }

        summarySentences.sort((s1, s2) -> {
            int count1 = 0;
            int count2 = 0;
            for (String word : rankedWords) {
                if (s1.toLowerCase().contains(word)) {
                    count1 += wordFrequencies.get(word);
                }
                if (s2.toLowerCase().contains(word)) {
                    count2 += wordFrequencies.get(word);
                }
            }
            return count2 - count1;
        });

        if (summarySentences.size() > numSentences) {
            summarySentences = summarySentences.subList(0, numSentences);
        }
        
        this.summaryText = String.join(". ", sentences) + ".";
    }
    public void update(Note newNote){
        // 기존 내용과 변경됐다면
        // 다시 summarize
        String newText = newNote.getText();
        if (!this.text.equals(newText)) {
            this.text = newText;
            summarize();
        }
    }
    
}
