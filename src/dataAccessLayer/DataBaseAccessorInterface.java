package dataAccessLayer;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

public interface DataBaseAccessorInterface {

	public void insertion(List<List<String>> row, String tablename, int i);

	public ArrayList<String> getColumnsOfTable(String tableName);

	public int getNumberOfTableColumns(String tableName);
}
