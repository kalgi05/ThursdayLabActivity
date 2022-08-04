//write a java program to test the Equality of two arrays.

import java.util.Arrays;
public class EqualityOfArray
{
	public static void main(String args[])
	{
		int x[]={10,20,30};				//first array element
		int y[]={30,20,10};				//second array element
		
			boolean ans=Arrays.equals(x,y);

			if(ans == true)									//condition to check values are true ya not
			{
				System.out.println("two arrays are equal");
			}
			else
			{
				System.out.println("two arrays are equal");
			}
	}
}
				