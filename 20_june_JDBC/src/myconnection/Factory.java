package myconnection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Factory {

	private static Connection connection;
	private static Factory factory = null;
	
	private Factory () throws SQLException{
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Vikramdb","root","Vikramdb");
	}
	
	public static Factory createObject() throws SQLException {
		if(factory == null) {
			factory = new Factory();
			
		}
		return factory;
		
	}
	
	public Connection getConnection() throws SQLException {
		return connection;
	}
	
	
}