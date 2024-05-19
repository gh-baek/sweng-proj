import java.util.List;
public class SearchResultImpl implements SearchHistory{
	private String query;
	private List<SearchEngine> results;
	
	public List<SearchEngine> getResults(){return null;}
	public String getTitles() {return "";}
	public String getUrls() {return "";}

	@Override
	public void addSearch(SearchResult searchResult) {

	}

	@Override
	public void removeSearch(SearchResult searchResult) {

	}

	@Override
	public List<SearchResult> getHistory() {
		return null;
	}
}
