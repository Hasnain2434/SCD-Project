package dataAccessLayerPERSISTENTLAYER;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.mysql.cj.jdbc.result.ResultSetMetaData;

public class DataBaseAccessorManageWord implements  DataBaseAccessorInterfaceManageWord{

	private DataBaseConnectionInterface connection;
	private String query;
	
	public DataBaseAccessorManageWord()
	{
		connection = DataBaseConnection.getInstance();
		connection.createConnection();
	}
	
	@Override
	public void insertMeaning(String word, String meaning, String tableName) {
		try
		{
			query = "Select معنی from "+tableName + " WHERE بغیر_اعراب_مشکول = '" + word + "'" ;
			ResultSet rs = connection.getConnection().createStatement().executeQuery(query);
			while (rs.next())
			{
				String mean = rs.getString(1);
				if(mean != null)
					meaning = mean + " " + meaning;
			} //end while
			
			query="UPDATE "+tableName + " SET معنی = '" + meaning +"' WHERE بغیر_اعراب_مشکول = '" + word  + "'" ;
			connection.getConnection().createStatement().executeUpdate(query);
		}
		catch(SQLException e)
		{
			System.out.println(e.toString());
			System.out.println(query);
		}
		
	}

	@Override
	public Boolean wordFound(String word, String tableName) {
		int count2 = 0;
		try {
			query = "select count(*) from "+ tableName +" where بغیر_اعراب_مشکول = '"+ word  + "'" ;
			ResultSet rs = connection.getConnection().createStatement().executeQuery(query);
			rs.next();
			count2 = rs.getInt(1);
			if(count2 == 0)
				return false;
			return true;
		}
		catch (SQLException e)
		{
			System.out.println(e.toString());
			System.out.println(query);
			return false;
		}
	}

	@Override
	public int countColumns(String tableName) {
		try {
			query = "select * from "+tableName ;
			ResultSet rs = connection.getConnection().createStatement().executeQuery(query);
		    ResultSetMetaData rsMetaData = (ResultSetMetaData) rs.getMetaData();
		    return rsMetaData.getColumnCount();
		}
		catch (SQLException e)
		{
			System.out.println(e.toString());
			System.out.println(query);
			return 0;
		}
	}

	@Override
	public ArrayList<String> returnColumnNames(String tableName) {
		ArrayList<String> ColumnNames= new ArrayList<String>();
		try {
			query = "select * from "+tableName ;
			ResultSet rs = connection.getConnection().createStatement().executeQuery(query);
		    ResultSetMetaData rsMetaData = (ResultSetMetaData) rs.getMetaData();
		    int count2 = rsMetaData.getColumnCount();
		      for(int i = 1; i<=count2; i++) {
		    	  ColumnNames.add( rsMetaData.getColumnName(i));
		      }
		}
		catch (SQLException e)
		{
			System.out.println(e.toString());
			System.out.println(query);
		}
		return ColumnNames;
	}

	@Override
	public ArrayList<String> getRow(String word, String tableName) {
		ArrayList<String> rowData = new ArrayList<String>();
		try {
			query = "select * from "+ tableName + " where بغیر_اعراب_مشکول = '"+ word +"'";
			ResultSet rs = connection.getConnection().createStatement().executeQuery(query);
			while (rs.next())
			{
				for(int i=1; i <= countColumns(tableName); i++)
					rowData.add(rs.getString(i));
			} //end while
			
		}
		catch (SQLException e)
		{
			System.out.println(e.toString());
			System.out.println(query);
		}
		return rowData;
	}

	@Override
	public void updateRoot(String root, String word, String tableName) {
		try
		{
			if(root==null)
				return;
			query = "";
			query="UPDATE "+tableName+ " SET Root = '" + root +"' WHERE بغیر_اعراب_مشکول = '" + word + "'"  ;
			connection.getConnection().createStatement().executeUpdate(query);
			System.out.println(query);
		}
		catch(SQLException e)
		{
			System.out.println(e.toString());
			System.out.println("Query : "+query);
		}
	}

	@Override
	public String[] getRoots(String word, String tableName) {
		String[] roots = null;
		String root = "";
		try
		{
			query = "";
			query="Select Root from "+tableName+ " WHERE  بغیر_اعراب_مشکول = '" + word + "'"  ;
			ResultSet rs = connection.getConnection().createStatement().executeQuery(query);
			while (rs.next())
			{
				root = rs.getString(1);
			} 
			roots  = root.split(" ");
		}
		catch(SQLException e)
		{
			System.out.println(e.toString());
			System.out.println("Query : "+query);
		}
		return roots;
	}
	
	public void finalize()
	{
		connection.closeConnection();
	}
}
