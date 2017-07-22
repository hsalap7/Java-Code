class VarArgs
{
	static void vatest(int ...v)
	{
		System.out.print("Length " +v.length+ " Contents: ss");
		for(int x: v)
		System.out.print( x+ " " );
	}

	public static void main(String args[])
	{
		vatest(4,2,8);
	}
}