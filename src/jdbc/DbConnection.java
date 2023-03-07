package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection 
{
	private static final String URLNAME     ="jdbc:mysql://localhost:3306/test";
	private static final String DRIVERCLASS ="com.mysql.cj.jdbc.Driver";
	private static final String USERNAME    ="root";
	private static final String PASSWORD	="root";	
	
	public static Connection getDbConnection() 
	{
		Connection conn = null;
		try 
		{
			// 1) load DriverClass
			Class.forName(DRIVERCLASS);
			
			// 2) Database --- getConnection
			conn = DriverManager.getConnection(URLNAME, USERNAME, PASSWORD);
			
		} catch (ClassNotFoundException e) 
		{
			e.printStackTrace();
		} catch (SQLException e) 
		{
			e.printStackTrace();
		}
		return conn;
	}
}
