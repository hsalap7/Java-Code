class p4
	{
	String name;
	int age;
	String designation;
	String address;
	
	public static void main(String[] args)
		{
		p4 P1=new p4();
		p4 P2=new p4();
		
		P1.name="pehla";
		P1.age=13;
		P1.designation="CEO";
		P1.address="NOIDA";
		
		P2.name="dusra";
		P2.age=14;
		P2.designation="NOTCEO";
		P2.address="DELHI";
		
		System.out.println("First person's details\n"+P1.name+"\n"+P1.age+"\n"+P1.designation+"\n"+P1.address+"\n");
		System.out.println("Second person's details\n"+P2.name+"\n"+P2.age+"\n"+P2.designation+"\n"+P2.address+"\n");
		
		if(P1.age>P2.age)
			{
			System.out.println("\n"+P1.name+"\n"+P1.address);
			}
		else
			{
			System.out.println("\n"+P2.name+"\n"+P2.address);
			}
		
		}
	
	}