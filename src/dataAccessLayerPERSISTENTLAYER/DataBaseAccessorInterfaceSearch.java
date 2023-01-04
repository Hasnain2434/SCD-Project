package dataAccessLayerPERSISTENTLAYER;

import java.util.List;

public interface DataBaseAccessorInterfaceSearch {
	
	public List<List<String>> getSearchedData(String word,String column,String tableName,int numberOfTableColumns);
	public String searchSingleWord(String word);
}
