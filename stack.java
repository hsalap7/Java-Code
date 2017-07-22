package Java;
class stack
{
	int stck[]=new int[10];
	int cnt=-1;
	void push(int value)
	{
		if(cnt==10)
		System.out.println("Stack is full");
		else
		stck[++cnt]=value;
	}
	int pop()
	{
		if(cnt<0)
		{
			System.out.println("Stack is empty");
			return 0;
		}
		else
		return stck[cnt--];
	}
}
class demo
{
	public static void main(String args[])
	{
		stack stack1=new stack();
		for(int i=0;i<10;i++) stack1.push(i);
		for(int i=10;i>0;i--) System.out.println(stack1.pop());
	}
}