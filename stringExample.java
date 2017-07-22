public class stringExample
{
	private String para="This is a repeatable string which repeats This is a repeatable string which repeats This is a repeatable string which repeats";
	
	public void particularFrequency(String s)
	{
		int index=-1,count=0,i=0;
		while(i<para.length())
		{
			index=para.indexOf(s,i);
			if(index>=0)
			{
			index++;
			i=index;
			count++;
			}
			else
			{
				break;
			}
		}
		System.out.println("\nThe frequency of string |"+s+"| is "+count+"\n");
	}
	
	public void frequency()
	{
		String s[]=para.split(" ");
		for(int j=0;j<s.length;j++)
		{
			int count=0, compare=1;
			for(int i=0;i<s.length;i++)
			{
				compare=s[j].compareTo(s[i]);
				if(compare==0)
				{
					count++;
				}
			}
			if(s[j].equals(""))
			{}
			else
			{
			System.out.println("\nThe frequency of the string |"+s[j]+"| is "+count+"\n");
			}
			String cmp=s[j];
			for(int k=0;k<s.length;k++)
			{
				if(s[k].equals(cmp))
				{
					s[k]="";
				}
			}
		}
		System.out.println();
	}
	
	public String myTrim()
	{
		String s=para.replace(" ", "");
		System.out.println("\n"+s+"\n");
		return s;
	}
	
	public void giveIndex(String s)
	{
		int index=-1,i=0;
		System.out.print("The index of the string |"+s+"| are : ");
		while(i<para.length())
		{
			index=para.indexOf(s,i);
			if(index>=0)
			{
				System.out.print(index+"\t");
				index++;
				i=index;
			}
			else
			{
				break;
			}
		}
		System.out.println("\n");
	}
	
	public String[] mySplit(String d)
	{
		String r=para.replace(d,"["+d+"]@");
		String[] s=r.split("@");
		for(String i:s)
		{
			System.out.println(i);
		}
		return s;
	}
}

class TestString
{
	public static void main(String...args)
	{
		stringExample str=new stringExample();
		str.myTrim();
		str.giveIndex("This");
		str.mySplit("is");
		str.particularFrequency("is");
		str.frequency();
	}
}