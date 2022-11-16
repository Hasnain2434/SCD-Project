package dataAccessLayer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

public class DataBaseAccessor 
{
	private String url;
	private String username;
	private String password;
	private String query;
	private Connection con;
	private static int numberofdata;
	public DataBaseAccessor()
	{
		try
		{
		url="jdbc:mysql://localhost:3306/SoftwareConstructionAndDevelopment?useSSL=false";
		username="root";
		password=""; 
		con=DriverManager.getConnection(url, username, password);
		numberofdata=1;
		}
		catch(SQLException e)
		{
			System.out.println(e.toString());
		}
	}
	public void insertion(List<String> row,String tablename)
	{
		int counter=0;
		try
		{
			query="INSERT INTO "+tablename+" VALUES (";
			while(counter<row.size())
			{
				
				if(counter==row.size()-1)
				{
					query=query+row.get(counter)+"')";
				}
				else if(counter==0)
				{
					query=query+numberofdata+",'";
				}
				else
				{
					query=query+row.get(counter)+"', '";
				}
				counter++;
			}
			
			con.createStatement().execute(query);
			
		}
		catch(SQLException e)
		{
			System.out.println(e.toString());
			System.out.println(query);
		}
		finally
		{
			this.numberofdata++;
		}
	}
	public void finalize()
	{
		try {
			con.close();
		} 
		catch (SQLException e) {
		
			System.out.println(e.toString());
		}
	}
}
