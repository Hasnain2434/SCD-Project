package dataAccessLayer;

import java.util.ArrayList;
import java.util.List;

public class Facade implements FacadeInterface {
	
	private DataBaseAccessorInterface databaseAccessorObject;

	public Facade()
	{
		databaseAccessorObject=new DataBaseAccessor();
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

}
