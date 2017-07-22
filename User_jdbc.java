import java.sql.*;
import java.util.Scanner;
public class User_jdbc
{
    static private String name, password, email, city, state;
    static private int phone_number;
    
    static Scanner sc=new Scanner(System.in);
	
	public static void main(String... args) 
    throws Exception
    {
        String driver="oracle.jdbc.OracleDriver",
           url="jdbc:oracle:thin:@localhost:1521:xe",
           user="system", passwd="root";
		Class.forName(driver);
		Connection c=DriverManager.getConnection(url, user, passwd);
		Statement s=c.createStatement();
		String query2="select * from user_table";
		ResultSet rs=s.executeQuery(query2);
		System.out.println("Enter 1 to enter data\nEnter 2 to view all data\nEnter 3 to see data by name\nEnter 4 to see data by City\nEnter 5 to see data by state\n\nEnter 6 to end connection and exit");
		int select=sc.nextInt();
		if(select==1)
		{
			System.out.print("Please enter name:");
			String name=sc.next();
			System.out.print("Please enter password:");
			String password=sc.next();
			System.out.print("Enter phone number:");
			long phone_number=sc.nextLong();
			System.out.print("Enter email ID:");
			String email=sc.next();
			System.out.print("Enter city name:");
			String city=sc.next();
			System.out.print("Enter state name:");
			String state=sc.next();
		  
			String query="insert into user_table values('"+name+"', '"+password+"','"+phone_number+"', '"+email+"','"+city+"','"+state+"')";
			s.executeUpdate(query);
			System.out.println("One record saved");
			main();
		}
		
		else if(select==2)
		{
			System.out.println("Persons name | Password | Phone Number | Email ID | City | State");
			while(rs.next())
			{
				String name1=rs.getString("name"); 
				String password1=rs.getString("password"); 
				String phone_number1=rs.getString("phone_number"); 
				String email1=rs.getString("email"); 
				String city1=rs.getString("city");
				String state1=rs.getString("state");
				System.out.println(name1+" | "+password1+" | "+phone_number1+" | "+email1+" | "+city1+" | "+state1);
			}
			main();   
		}
		
		else if(select==3)
		{
			System.out.print("Enter the name whose details you want to see:");
			String input=sc.next();
			System.out.println("Persons name | Phone Number | Email ID | City | State");
			while(rs.next())
			{
				if(input.equals(rs.getString("name")))
				{
					String name1=rs.getString("name");  
					String phone_number1=rs.getString("phone_number"); 
					String email1=rs.getString("email"); 
					String city1=rs.getString("city");
					String state1=rs.getString("state");
					System.out.println(name1+" | "+phone_number1+" | "+email1+" | "+city1+" | "+state1);
				}
			}
			main();
		}
		
		else if(select==4)
		{
			System.out.print("Enter the city whose details you want to see:");
			String input=sc.next();
			System.out.println("In the city of "+input+" following persons reside:");
			while(rs.next())
			{
				if(input.equals(rs.getString("city")))
				{
					String name1=rs.getString("name");  
					System.out.println(">>"+name1);
				}
			}
			main();
		}
		
		else if(select==5)
		{
			System.out.print("Enter the state whose details you want to see:");
			String input=sc.next();
			System.out.println("In the state of "+input+" following persons reside:");
			while(rs.next())
			{
				if(input.equals(rs.getString("state")))
				{
					String name1=rs.getString("name");  
					System.out.println(">>"+name1);
				}
			}
			main();
		}
		
		else
		{
			c.close();
			return;
		}
	}
}


