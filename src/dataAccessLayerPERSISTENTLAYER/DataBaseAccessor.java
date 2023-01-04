package dataAccessLayerPERSISTENTLAYER;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import com.mysql.cj.jdbc.result.ResultSetMetaData;

public class DataBaseAccessor implements DataBaseAccessorInterface {

	private DataBaseConnectionInterface connection;
	private String query;

	public DataBaseAccessor()
	{
		connection = DataBaseConnection.getInstance();
		connection.createConnection();
	}

	/**
	 * This function is written by Hasnain Riaz 20F-0300 It takes an list of String
	 * and a table name creates query according to it and sends it to the database
	 */
	public void insertion(List<List<String>> row, String tablename, int numberOfTblClmn) {
		query = "";
		int counter = 0;
		try {
			for (int i = 0; i < row.size(); i++) {
				query = "INSERT INTO " + tablename + " VALUES (";
				while (counter < row.get(i).size()) {
					if (counter == row.get(i).size() - 1 && row.get(i).size() == numberOfTblClmn) {
						query = query + row.get(i).get(counter) + "')";
						break;
					} else if (counter == 0) {
						query = query + Integer.parseInt(row.get(i).get(counter)) + ",'";
					} else if (counter != row.get(i).size() - 1) {
						query = query + row.get(i).get(counter) + "', '";
					} else if (counter == row.get(i).size() - 1) {
						query = query + row.get(i).get(counter) + "' ";
					}
					counter++;
				}
				if (row.get(i).size() != numberOfTblClmn) {
					while (counter < numberOfTblClmn) {
						if (counter == numberOfTblClmn - 1) {
							query = query + ",null)";
						} else {
							query = query + ", null";
						}
						counter++;
					}
				}
				counter = 0;
				connection.getConnection().createStatement().execute(query);
			}
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Error in the Query. " + e.toString());
		}
	}

	public ArrayList<String> getColumnsOfTable(String tableName) {
		ArrayList<String> columnNames = new ArrayList<String>();
		query = "Select * from " + tableName;
		try {
			ResultSet resultSet = connection.getConnection().createStatement().executeQuery(query);
			ResultSetMetaData metaData = (ResultSetMetaData) resultSet.getMetaData();
			for (int i = 1; i <= metaData.getColumnCount(); i++) {
				columnNames.add(metaData.getColumnName(i));
			}
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, "Error in fetching column names");
		}
		return columnNames;
	}

	public int getNumberOfTableColumns(String tableName) {
		query = "Select * from " + tableName;
		try {
			ResultSet resultset = connection.getConnection().createStatement().executeQuery(query);
			ResultSetMetaData metaData = (ResultSetMetaData) resultset.getMetaData();
			return metaData.getColumnCount();
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null, e);
			return (Integer) null;
		}
	}

	/**
	 * By Hasnain Riaz This is a destructor created to close the connection
	 */
	public void finalize() {
		connection.closeConnection();
	}
}