class Patient
{
	String name;
	int glucose_level;
	
	void showInfo()
	{
		System.out.print("Hello "+name+" your glucose level is "+glucose_level);
	}
	void check()
	{
		if(glucose_level<70)
			System.out.println(" and you are suffering from hypoglycemia");
		else if(glucose_level>100)
			System.out.println(" and you are suffering fom hyperglycemia");
		else
			System.out.println(" and your glucose level is normal");
	}
	
	public static void main(String[] args)
	{
		Patient p1=new Patient("Aman Gupta", 80);
		Patient p2=new Patient("Anita Mishra", 50);
		Patient p3=new Patient("Ankur Sharma", 180);
		
		p1.showInfo();
		p1.check();
		
		p2.showInfo();
		p2.check();
		
		p3.showInfo();
		p3.check();
	}
	
	Patient(String a, int b)
	{
		name=a;
		glucose_level=b;
	}
}