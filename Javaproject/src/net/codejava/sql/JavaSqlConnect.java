package net.codejava.sql;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class JavaSqlConnect 
{
	public static void main(String[] args)
	{
		String connectionUrl = "jdbc:sqlserver://DESKTOP-NELEJ9B\\SIDDHISQL:63807;databaseName=master;user=sa;password=siddhi@0308";

		try (Connection con = DriverManager.getConnection(connectionUrl);)
		{
					System.out.println("Connected");
				}
		 	catch (SQLException e)
		 	{
					System.out.println("Error");
					e.printStackTrace();
				}

		
	}
}
