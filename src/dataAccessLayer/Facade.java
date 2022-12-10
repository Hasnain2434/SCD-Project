package dataAccessLayer;

import java.util.ArrayList;
import java.util.List;

public class Facade implements FacadeInterface {
	
	private DataBaseAccessorInterface databaseAccessorObject;
	private DataBaseAccessorInterfaceUc2 databaseAccessorObject2;

	public Facade()
	{
		databaseAccessorObject=new DataBaseAccessor();
		databaseAccessorObject2=new DataBaseAccessorUc2();
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
		databaseAccessorObject2.insertMeaning(word, meaning, tableName);
		
	}
	@Override
	public Boolean wordFound(String word, String tableName) {
		return databaseAccessorObject2.wordFound(word, tableName);
	}
	@Override
	public int countColumns(String tableName) {
		return databaseAccessorObject2.countColumns(tableName);
	}
	@Override
	public ArrayList<String> returnColumnNames(String tableName) {
		return databaseAccessorObject2.returnColumnNames(tableName);
	}
	@Override
	public ArrayList<String> getRow(String word, String tableName) {
		return databaseAccessorObject2.getRow(word, tableName);
	}
	@Override
	public void updateRoot(String root, String word, String tableName) {
		databaseAccessorObject2.updateRoot(root, word, tableName);
	}
	@Override
	public String[] getRoots(String word, String tableName) {
		return databaseAccessorObject2.getRoots(word, tableName);
	}

}
