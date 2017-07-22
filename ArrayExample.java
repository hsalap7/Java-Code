import java.util.Scanner;
public class ArrayExample
{
	private int arr[];
	private int size;
	
	Scanner sc=new Scanner(System.in);
	
	public void store()
	{
		System.out.print("\nEnter size of array:");
		size=sc.nextInt();
		arr=new int[size];
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Enter element for index #"+i);
			arr[i]=sc.nextInt();
		}
		set();
		
	}
	
	public void show()
	{
		System.out.println();
		for(int i:arr)
		{
			System.out.print(i+"\t");
		}
		set();
	}
	
	public void sort()
	{
		
		int a[]=new int[size];
		for(int i=0;i<arr.length;i++)
		{
			a[i]=arr[i];
		}
		System.out.println("Enter 1 for ascending order\nEnter 2 for descending order\n:");
		int select=sc.nextInt();
		if(select==1)
		{
			for(int i=1;i<a.length;i++)
			{
				for(int j=i;j>0 && a[j]<a[j-1];j--)
				{
					int temp;
					temp = a[j];
					a[j] = a[j-1];
					a[j-1] = temp;
				}
			}
		}
		if(select==2)
		{
			for(int i=1;i<a.length;i++)
			{
				for(int j=i;j>0 && a[j]>a[j-1];j--)
				{
					int temp;
					temp = a[j];
					a[j] = a[j-1];
					a[j-1] = temp;
				}
			}
		}
		System.out.println("\nThe sorted order is\n");
		for(int i: a)
		{
			System.out.print(i+"\t");
		}
		System.out.println();
		set();
	}
	
	public void countFrequency()
	{
		int i=0,count=0,flag=0;
		while(i<size)
		{
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
					count++;
			}
			if(count>1)
				System.out.println("\nThe number"+arr[i]+" repeats "+count+" number of times\n");
			else
				System.out.println("\nThe number"+arr[i]+" repeats "+count+" number of time\n");
			count=0;
			i++;
		}
		set();
			
	}
	
	public void reverse()
	{
		int a[]=new int[size];
		for(int i=arr.length-1;i>=0 ;i--)
		{
			a[arr.length-1-i]=arr[i];
		}
		for(int k:a)
		{			
			System.out.print(k+"\t");
		}
		set();
	}
	
	public void getMaxMin()
	{
		int max=arr[0];
		int min=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
				max=arr[i];
			if(arr[i]<min)
				min=arr[i];
		}
		System.out.println("\nThe largest element is "+max+" while the smallest is "+min);
		set();
	}
	
	public void getMaxMinV2()
	{
		int a[]=new int[size];
		for(int i=0;i<arr.length;i++)
		{
			a[i]=arr[i];
		}

		for(int i=1;i<a.length;i++)
		{
			for(int j=i;j>0 && a[j]<a[j-1];j--)
			{
				int temp;
				temp = a[j];
				a[j] = a[j-1];
				a[j-1] = temp;
			}
		}
		
		int max2=a[size-1];
		int min2=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<=min2)
			{
			}
			else
			{
				min2=a[i];
				break;
			}
		}
		for(int i=a.length-1;i>=0;i--)
		{
			if(a[i]>=max2)
			{
			}
			else
			{
				max2=a[i];
				break;
			}
		}
		System.out.println("\nThe second largest element is "+max2+" while the second smallest element is "+min2+"\n");
		set();
		
	}
	
	public void getFirstIndex()
	{
		System.out.print("\nEnter the number whose index you want :");
		int want=sc.nextInt();
		int found=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==want)
			{
				found=i;
				break;
			}
		}
		System.out.println("\nThe first index of "+want+" is "+found+"\n");
		set();
	}
	
	public void getLastIndex()
	{
		System.out.print("\nEnter the number whose index you want :");
		int want=sc.nextInt();
		int found=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==want)
			{
				found=i;
			}
		}
		System.out.println("\nThe last index of "+want+" is "+found+"\n");
		set();
		
	}
	
	public void getAllIndex()
	{
		System.out.print("\nEnter the number whose index you want :");
		int want=sc.nextInt();
		int found=0;
		System.out.println("\nThe index's of the given number are\n");
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==want)
			{
				found=i;
				System.out.print(found+"\t");
			}
		}
		System.out.println();
		set();
	}
	
	public void subArray()
	{
		int sp, ep;
		System.out.print("\nEnter the starting index:");
		sp=sc.nextInt();
		System.out.print("Enter the ending index:");
		ep=sc.nextInt();
		int sze=ep-sp+1;
		int a[]=new int[sze];
		for(int i=sp;i<=ep;i++)
		{
			a[i-sp]=arr[i];
		}
		System.out.print("\nThe sub array is\n");
		for(int i:a)
		{
		System.out.print(i+"\t");
		}
		System.out.println();
		set();
		
	}
	
	public void set()
	{
			
		Scanner s=new Scanner(System.in);
		int select;
		System.out.print("Enter 1 to store in array\nEnter 2 to show array\nEnter 3 to sort the array\nEnter 4 to count frequency of a given number\nEnter 5 to reverse the array\nEnter 6 to get maximum and minimum element\nEnter 7 to get second maximum and minimum element in the array\nEnter 8 to get first index of a given number\nEnter 9 to get the last index of a given number\nEnter 10 to get all index's of a given  number\nEnter 11 to get a subarray\nEnter any other number to exit\n:");
		select=s.nextInt();
		switch(select)
		{
			case 1:
			{
				store();
				break;
			}
			case 2:
			{
				show();
				break;
			}
			case 3:
			{
				sort();
				break;
			}
			case 4:
			{
				countFrequency();
				break;
			}
			case 5:
			{
				reverse();
				break;
			}
			case 6:
			{
				getMaxMin();
				break;
			}
			case 7:
			{
				getMaxMinV2();
				break;
			}
			case 8:
			{
				getFirstIndex();
				break;
			}
			case 9:
			{
				getLastIndex();
				break;
			}
			case 10:
			{
				getAllIndex();
				break;
			}
			case 11:
			{
				subArray();
				break;
			}
			default:
				System.exit(0);
		}
		
	}

}

class TestArray
{
	public static void main(String... args)
	{
		ArrayExample a=new ArrayExample();
		a.set();
	}
}