package dataAccessLayer;

import java.sql.Connection;

public interface DataBaseConnectionInterface {
	
	public void createConnection();

	public void closeConnection();
	
	public Connection getConnection();
}
