package util.jpa;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {

	public Connection getConnection() {
		
		try {
			return DriverManager.getConnection(
					"jdbc:sqlserver://localhost:1433;databaseName=libfinance;user=sa;password=javadeveloper"
			);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
		
	}
}
