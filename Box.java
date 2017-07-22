class Box
{
	double width,length,height;
	double volume() 
	{
		return width*length*height;
	}
}
class Boxdemo
{
	public static void main(String args[])
	{
		Box box1=new Box();
		Box box2=new Box();
		double vol;
		
		box1.width=20;
		box1.length=10;
		box1.height=5;
		
		vol=box1.volume();
		System.out.println("The Volume is " +vol);
		
		box2.width=120;
		box2.length=110;
		box2.height=15;
		
		vol=box2.volume();
		System.out.println("The Volume is " +vol);
	}
}