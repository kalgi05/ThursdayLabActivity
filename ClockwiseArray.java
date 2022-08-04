//write a java program to  cyclically rotate a given array clockwise by one.

public class ClockwiseArray
{
	public static void main(String args[])
	{
		int a[]= {10,20,30,40,50,60};
		System.out.println("original array elements");
		
		for (int i=10;i<a.length;i++)					//using for loop
		{
			System.out.println(a[i]+"");						//print forloop
		}
		
		System.out.println("array in clockwise order");
		for (int i=a.length-1;i>=0;i--)								//reverse order using for loop
		{
			System.out.println(a[i]+"");								//print forloop
		}
	}
}