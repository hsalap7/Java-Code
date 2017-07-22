import java.util.Scanner;
class user
{
	String name;
	long mobile_no;
	float age;
	boolean marital_status;
	
	void setUser()
	{
		Scanner s=new Scanner(System.in);
		System.out.print("\nPlease enter the name:");
		name=s.nextLine();
		System.out.print("Please enter mobile number:");
		mobile_no=s.nextLong();
		System.out.print("Please enter age:");
		age=s.nextInt();
		System.out.print("Please enter marital status:");
		marital_status=s.nextBoolean();
	}
	
	void showUser()
	{
		System.out.println("Person's name is "+ name+"\nHis mobile number is "+ mobile_no+"\nHis age is "+ age+"\nAnd his marital status is "+ marital_status);
	}
	
	public static void main(String ... args)
	{
		user a=new user();
		a.setUser();
		a.showUser();
	}
}