package database;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnectionManager {

	private Connection conn;

        private String url = "jdbc:mysql://localhost:3306/employees_database?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";

	private static DatabaseConnectionManager connectionInstance = new DatabaseConnectionManager();

	private DatabaseConnectionManager() {

	}

	public static DatabaseConnectionManager getManagerInstance() {
		return connectionInstance;
	}

	/**
	 * contains connection details
	 * 
	 * @throws SQLException
	 */
	public void connect() throws SQLException {
		// processing specific to database connection details...
		conn = DriverManager.getConnection("url, "root", "pass123");
		System.out.println("Established Database Connection...");
	}

	public Connection getConnectionObject() {
		return conn;
	}

	public void disconnect() throws SQLException {
		conn.close();
		System.out.println("Disconnected from Database...");
	}
}