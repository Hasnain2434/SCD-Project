package dataAccessLayer;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

public interface DataBaseInterface {
	public void insertion(List<List<String>> row, String tablename, int i);

	public ArrayList<String> getColumns(String tableName);

	public int getNumberOfTableColumns(String tableName);
}
