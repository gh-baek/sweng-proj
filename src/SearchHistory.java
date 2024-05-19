import java.util.List;
public interface SearchHistory {
	void addSearch(SearchResult searchResult);
    void removeSearch(SearchResult searchResult);
    List<SearchResult> getHistory();
}
