//find number of vowels

import java.io.*;
public class Vowels {

	public static void main(String args[])
	
	{
		String str= "kalgi";
		str=str.toLowerCase();
		int count=0;
		
			for (int i=0;i<str.length();i++)
			{
				if (str.charAt(i)=='a'|| str.charAt(i)=='e'|| str.charAt(i)=='i'|| 
						str.charAt(i)=='o'|| str.charAt(i)=='u' );
				{
					count ++;
								
			    }
			}
				System.out.println("total no of vowels are"+count);	
			}
		}
		