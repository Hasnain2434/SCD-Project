package dataAccessLayerPERSISTENTLAYER;

import java.util.ArrayList;
import java.util.List;

public class Facade implements FacadeInterface {
	
	private DataBaseAccessorInterface databaseAccessorObject;
	private DataBaseAccessorInterfaceManageWord databaseAccessorObjectMeaning;
	private DataBaseAccessorInterfaceSearch databaseAccessorObjectSearch;
	public Facade()
	{
		databaseAccessorObject=new DataBaseAccessor();
		databaseAccessorObjectMeaning=new DataBaseAccessorManageWord();
		databaseAccessorObjectSearch=new DataBaseAccessorSearch();
	}
	@Override
	public void insertion(List<List<String>> row, String tablename, int i) {
		databaseAccessorObject.insertion(row, tablename, i);
	}

	@Override
	public ArrayList<String> getColumnsOfTable(String tableName) {
		return databaseAccessorObject.getColumnsOfTable(tableName);
	}

	@Override
	public int getNumberOfTableColumns(String tableName) {
		return databaseAccessorObject.getNumberOfTableColumns(tableName);
	}
	@Override
	public void insertMeaning(String word, String meaning, String tableName) {
		databaseAccessorObjectMeaning.insertMeaning(word, meaning, tableName);
		
	}
	@Override
	public Boolean wordFound(String word, String tableName) {
		return databaseAccessorObjectMeaning.wordFound(word, tableName);
	}
	@Override
	public int countColumns(String tableName) {
		return databaseAccessorObjectMeaning.countColumns(tableName);
	}
	@Override
	public ArrayList<String> returnColumnNames(String tableName) {
		return databaseAccessorObjectMeaning.returnColumnNames(tableName);
	}
	@Override
	public ArrayList<String> getRow(String word, String tableName) {
		return databaseAccessorObjectMeaning.getRow(word, tableName);
	}
	@Override
	public void updateRoot(String root, String word, String tableName) {
		databaseAccessorObjectMeaning.updateRoot(root, word, tableName);
	}
	@Override
	public String[] getRoots(String word, String tableName) {
		return databaseAccessorObjectMeaning.getRoots(word, tableName);
	}
	@Override
	public List<List<String>> getSearchedData(String word, String column, String tableName, int numberOfTableColumns) {
		return databaseAccessorObjectSearch.getSearchedData(word, column, tableName, numberOfTableColumns);
	}
	@Override
	public String searchSingleWord(String word) {
		return databaseAccessorObjectSearch.searchSingleWord(word);
	}

}
