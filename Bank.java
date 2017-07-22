import java.util.Scanner;
public class Bank
{
	private long account_num;
	private String name;
	private double balance=500;
	private String city;

	
	public void deposit()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter your account number");
		long num=sc.nextLong();
		if(num==account_num)
		{
			System.out.println("Please enter the ammount to be deposited");
			double deposit=sc.nextDouble();
			balance=balance+deposit;
		}
		else
		{
			account_num=num;
			System.out.println("Account changed\n");
			System.out.println("Please enter the ammount to be deposited");
			double deposit=sc.nextDouble();
			balance=balance+deposit;
		}
		set();
	}
	
	public void openAccount()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter your name");
		name=sc.nextLine();
		System.out.println("Please enter your account number");
		account_num=sc.nextLong();
		System.out.println("Please enter your city name");
		city=sc.next();
		set();
	}
	
	public void withdraw()
	{
		Scanner sc=new Scanner(System.in);	
		System.out.println("Please enter the amount you want to withdraw");
		double withdrw=sc.nextDouble();
		balance=balance-withdrw;
		set();
	}
	
	public void checkBalance()
	{
		System.out.println("Hello "+name+"\nYour account number is "+account_num+"\nand you have Rs."+balance+"0 in your account\n\n");
		set();
	}
	public void interest()
	{
		if(balance<100001)
			balance=balance+balance*(0.03);
		if(balance>100000 && balance<200001)
			balance=balance+balance*(0.05);
		if(balance>200000 && balance<500001)
			balance=balance+balance*(0.06);
		if(balance>500000)
			balance=balance+balance*(0.07);
		set();
	}
	
	void set()
	{
		Scanner sc=new Scanner(System.in);	
		System.out.println("Welcome to the JAVA Bank\n\nThe options are as follows\n1.Deposit\n2.Open Account\n3.Withdraw\n4.Check Balance\n5.Interest\n6.Exit");
		int select=sc.nextInt();
		if(select==1)
				deposit();
		if(select==2)
		{
			Bank b=new Bank();
			b.openAccount();
		}
		if(select==3)
				withdraw();
		if(select==4)
				checkBalance();
		if(select==5)
				interest();
	}
}

class BankTest
{
		
	public static void main(String... args)
	{
		Bank b=new Bank();
		b.set();
	}
}
