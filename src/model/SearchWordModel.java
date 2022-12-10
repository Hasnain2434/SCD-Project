package model;

import java.util.List;

import dataAccessLayer.Facade;
import dataAccessLayer.FacadeInterface;

public class SearchWordModel {
	private FacadeInterface facade;
	private String tableName;
	
	public SearchWordModel()
	{
		facade=new Facade();
		tableName=null;
	}
	
	public List<List<String>> SearchWord(String word,String column)
	{
		List<List<String>> data;
		
		data=facade.getSearchedData(word, column,"faeel", facade.getNumberOfTableColumns("faeel"));
		tableName="faeel";
		if(data==null)
		{
			data=facade.getSearchedData(word, column,"masdar", facade.getNumberOfTableColumns("masdar"));
			tableName="masdar";
			if(data==null)
			{
				data=facade.getSearchedData(word, column,"mafoul", facade.getNumberOfTableColumns("mafoul"));
				tableName="mafoul";
			}
		}
		if(data==null)
			tableName=null;
		return data;
	}
	public String getTableName()
	{
		return tableName;
	}
}
