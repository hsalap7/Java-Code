import java.sql.*;
public class Connect
{
	public static void main(String...args)
	throws Exception
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","root");
		System.out.println("Booyah Connected");
	}
}