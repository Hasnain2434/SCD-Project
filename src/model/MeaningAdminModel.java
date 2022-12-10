package model;
import java.util.ArrayList;
import dataAccessLayer.DataBaseAccessor;
import dataAccessLayer.Facade;
import dataAccessLayer.FacadeInterface;

public class MeaningAdminModel {
	private FacadeInterface facade;
	public MeaningAdminModel()
	{
		facade=new Facade();
	}
	public void insertMeanings(String word,String meaning,String tablename)
	{	
		facade.insertMeaning(word, meaning, tablename);
	}
	public ArrayList<String> getRowData(String word, String tableName) {
		return facade.getRow(word, tableName);
	}
	
	public ArrayList<String> getColumnNames(String tableName) {
		return facade.returnColumnNames(tableName);
	}
	
	
	public Boolean findWord(String word,String tableName) {
		return facade.wordFound(word,tableName);
	}
	
	public int getColumnCount(String tableName) {
		return facade.countColumns(tableName);
	}
	
	public void updateRoots(String root,String word,String tableName) {
		facade.updateRoot(root,word,tableName);
	}
	
	public String[] getRoots(String word,String tableName) {
		return facade.getRoots(word, tableName);
	}
	
	public String getTableNameofWord(String word) {
		String []tables = {"faeel","mafoul","masdar"};
		for(int i=0; i<tables.length; i++) {
			if(facade.wordFound(word,tables[i]))
				return tables[i];
		}
		return "";
	}
}


