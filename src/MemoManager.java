import java.util.*;

public class MemoManager {
    private Map<Integer, Memo> memos;
    private TreeMap<String, Memo> voiceMemos;
    private int nextId;

    public MemoManager() {
        memos = new HashMap<>();
        voiceMemos = new TreeMap<>();
        nextId = 1;
    }

    // 음성 기록에서 구간 시간과 함께 메모를 저장하는 방법
    public int createMemoWithTimestamp(String content, String timestamp) {
        int memoId = nextId;
        Memo memo = new Memo(memoId, content, timestamp);
        memos.put(memoId, memo);
        voiceMemos.put(timestamp, memo);
        nextId++;
        return memoId;
    }

    // 자유롭게 타이핑해서 메모를 저장하는 방법
    public int createMemo(String content) {
        int memoId = nextId;
        Memo memo = new Memo(memoId, content);
        memos.put(memoId, memo);
        nextId++;
        return memoId;
    }

    // 메모 수정 메서드
    public void updateMemo(int memoId, String newContent) {
        Memo memo = memos.get(memoId);
        if (memo != null) {
            memo.setContent(newContent);
            if (memo.getTimestamp() != null) {
                voiceMemos.put(memo.getTimestamp(), memo);
            }
        } 
    }

    // 메모 삭제 메서드
    public void deleteMemo(int memoId) {
        Memo memo = memos.remove(memoId);
        if (memo != null) {
            if (memo.getTimestamp() != null) {
                voiceMemos.remove(memo.getTimestamp());
            }
            
        } 
    }

}