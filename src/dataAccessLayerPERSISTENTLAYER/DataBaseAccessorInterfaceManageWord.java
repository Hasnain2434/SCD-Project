package dataAccessLayerPERSISTENTLAYER;

import java.util.ArrayList;

public interface DataBaseAccessorInterfaceManageWord {
	public void insertMeaning(String word,String meaning, String tableName);
	
	public Boolean wordFound(String word,String tableName);
	
	public int countColumns(String tableName);

	public ArrayList<String> returnColumnNames(String tableName);
	
	public ArrayList<String> getRow(String word,String tableName);
	
	public void updateRoot(String root,String word, String tableName);
	
	public String[] getRoots(String word,String tableName);
}
