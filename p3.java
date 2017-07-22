class p3
	{
	int sp;
	int ep;
	static int count=0;
	public static void main(String args[])
		{
		p3 obj=new p3();
		int pr;
		obj.sp=10;
		obj.ep=30;
		if(obj.sp>obj.ep)
			{
			int temp=obj.sp;
			obj.sp=obj.ep;
			obj.ep=temp;
			}
		pr=obj.ep;
		while((obj.sp-1)<pr)	
		for(int i = obj.sp;i < obj.ep; i++)
			{
				int flg = 0;
				if (pr<=1)
				flg = 1;
				for(int j=2; j<=pr/2; j++)
					{
					if (pr%j == 0)
						{
						flg=1;
						pr--;
						break;
						}
					}
					if (flg == 0)
						{
						System.out.println("\n"+pr);
						count++;
						pr--;
						}
			}
		System.out.println("Number of primes\n"+count);
		}
	}