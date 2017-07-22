class rectangle
{
	int length, width;
	
	void show()
	{
		System.out.println("Length is: "+length+" Width is: "+width);
	}
	void getArea(int a,int b)
	{
	int area=a*b;
	System.out.println("The area is: "+area);
	}
	rectangle(int a, int b)
	{
	length=a;
	width=b;
	}
	public static void main(String[] args)
	{
	rectangle r1=new rectangle(10,20);
	r1.show();
	r1.getArea(r1.length,r1.width);
	}
}