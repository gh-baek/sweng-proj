import java.util.List;
public class SearchHistoryImpl implements SearchHistory{
	private SearchEngine searchEngine;
	private List<SearchResult> history;
	private List<SearchResult> favorites;
	
	public void addSearch() {}
	public void removeSearch() {}

	@Override
	public void addSearch(SearchResult searchResult) {

	}

	@Override
	public void removeSearch(SearchResult searchResult) {

	}

	public List<SearchResult> getHistory() {return null;}

}
