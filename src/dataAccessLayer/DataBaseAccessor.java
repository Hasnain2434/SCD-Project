package dataAccessLayer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import com.mysql.cj.jdbc.result.ResultSetMetaData;

public class DataBaseAccessor implements DataBaseInterface
{
	private String url;
	private String username;
	private String password;
	private String query;
	private Connection con;
	/**
	 * By Hasnain Riaz
	 * Constructor
	 */
	public DataBaseAccessor()
	{
		try
		{
		url="jdbc:mysql://localhost:3306/SoftwareConstructionAndDevelopment?useSSL=false";
		username="root";
		password=""; 
		con=DriverManager.getConnection(url, username, password);
		}
		catch(SQLException e)
		{
			JOptionPane.showMessageDialog(null, "Connection Failed");
		}
	}
	/**
	 * This function is written by Hasnain Riaz 20F-0300
	 * It takes an list of String and a table name creates query according to it
	 * and sends it to the database
	 */
	public void insertion(List<String> row,String tablename,int pk)
	{
		query="";
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
					query=query+Integer.parseInt(row.get(counter))+",'";
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
			JOptionPane.showMessageDialog(null, "Error in the Query. "+e.toString());
		}
	}
	public ArrayList<String> getColumns(String tableName)
	{
		ArrayList<String> columnNames=new ArrayList<String>();
		query="Select * from "+tableName;
		try
		{
		ResultSet resultset=con.createStatement().executeQuery(query);
		ResultSetMetaData metaData=(ResultSetMetaData)resultset.getMetaData();
		for(int i=1;i<=metaData.getColumnCount();i++)
		{
			columnNames.add(metaData.getColumnName(i));
		}
		return columnNames;
		}
		catch(SQLException e)
		{
			JOptionPane.showMessageDialog(null, e);
			return null;
		}
	}
	
	/**
	 * By Hasnain Riaz
	 * This is a destructor created to close the connection
	 */
	public void finalize()
	{
		try {
			con.close();
		} 
		catch (SQLException e) {
		
			JOptionPane.showMessageDialog(null, "Connection Closing Failed");
		}
	}
}
