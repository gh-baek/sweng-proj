import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Memo {
    private int id;
    private String content;
    private String timestamp;

    public Memo(int id, String content) {
        this.id = id;
        this.content = content;
        this.timestamp = null;
    }

    public Memo(int id, String content, String timestamp) {
        this.id = id;
        this.content = content;
        this.timestamp = timestamp;
    }

    public int getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) { // 내용 수정
        this.content = content;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }
}