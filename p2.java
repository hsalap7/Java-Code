class p2
	{
	static int X;
	static
		{
	     X=153;
		}
	public static void main(String args[])
		{
		int a,b=0;
		int Y=X;
		while(Y!=0)
		{
			a=Y%10;
			Y=Y/10;
			b=b+(a*a*a);
		}
		if(b==X)
			{
			System.out.println("The number is armstrong");
			}
		else
			{
			System.out.println("The number is not an armstrong number");
			}
		}
		
	}
	