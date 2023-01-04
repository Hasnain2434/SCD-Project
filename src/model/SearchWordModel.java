package model;

import java.util.List;

import dataAccessLayerPERSISTENTLAYER.Facade;
import dataAccessLayerPERSISTENTLAYER.FacadeInterface;

public class SearchWordModel {
	private FacadeInterface facade;
	
	public SearchWordModel()
	{
		facade=new Facade();
	}
	
	public List<List<String>> SearchWord(String word,String column)
	{
		List<List<String>> data;
		
		data=facade.getSearchedData(word, column,"faeel", facade.getNumberOfTableColumns("faeel"));
		return data;
	}
	public String getSingleMeaningFromDatabase(String word)
	{
		return facade.searchSingleWord(word);
	}
	
}
