package dataAccessLayer;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DataBaseAccessorSearch implements DataBaseAccessorInterfaceSearch{

	private DataBaseConnectionInterface connection;
	private String query;
	
	public DataBaseAccessorSearch()
	{
		connection=DataBaseConnection.getInstance();
		connection.createConnection();
	}
	@Override
	public List<List<String>> getSearchedData(String word, String column,String tableName,int numberOfTableColumns) {
		List<List<String>> dataSet=null;
		boolean found=false;
		int row=0;
		query="select * from "+tableName+" where "+column+"='"+word+"';";
		ResultSet rs=null;
		try {
			 rs=connection.getConnection().createStatement().executeQuery(query);
			 dataSet=new ArrayList<List<String>>();
			 while(rs.next())
			 {
				 
				 dataSet.add(new ArrayList<String>());
				 for(int i=1;i<=numberOfTableColumns;i++)
				 {
					 dataSet.get(row).add(rs.getString(i));
				 }
				 row++;
				 found=true;
			 }
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		if(found)
		return dataSet;
		else
		return null;
	}

}
