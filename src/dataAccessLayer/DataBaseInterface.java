package dataAccessLayer;

import java.sql.Connection;
import java.util.List;

public interface DataBaseInterface 
{
	public void insertion(List<String> row,String tablename,int i);
}
