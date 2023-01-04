package dataAccessLayerPERSISTENTLAYER;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class DataBaseConnection implements DataBaseConnectionInterface {
	private static DataBaseConnection dataBaseConnection;
	private static Connection dbConnection;
	private String url;
	private String username;
	private String password;

	private DataBaseConnection() {
	}

	public static DataBaseConnection getInstance() {
		if (dataBaseConnection == null) {
			dataBaseConnection = new DataBaseConnection();
		}
		return dataBaseConnection;
	}

	public void createConnection() {
		if (dbConnection == null) {
			url = "jdbc:mysql://localhost:3306/SoftwareConstructionAndDevelopment?useSSL=false";
			username = "root";
			password = "";
			try {
				dbConnection = DriverManager.getConnection(url, username, password);
			} catch (SQLException e) {
				JOptionPane.showMessageDialog(null,
						"Cannot connect to the Database, Please Check Xampp web server and Try again",
						"Connection Failure", 1);
			}
		}
	}
	
	public Connection getConnection()
	{
		return dbConnection;
	}

	public void closeConnection() {
		try {
			dbConnection.close();
		} catch (SQLException e) {
			System.out.println("Connection cannot be closed");
		}

	}

}
