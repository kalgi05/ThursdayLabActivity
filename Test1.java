package ThursdayLabTest;

import java.io.*;
public class Test1 {

	public static void main(String[] args) throws FileNotFoundException {
	    
	  	
	  		try
	  		{
	  			FileInputStream fin = new FileInputStream("D:\\TextReader.txt");
	  			int i=0;
	  			while((i=fin.read())!=-1)
	  			{
	  				System.out.print((char)i);
	  				
	  			}
	  			
	  	        	int i1=fin.read();
	  	            System.out.println((char)i1);
	  			    fin.close();
	  			
	  		}
	  		catch(Exception e)
	  		{
	  			System.out.println(e);
	  		}
	  		
	  		
	  		
	  		try
			{
				FileOutputStream fout=new FileOutputStream("D:\\TextReader.txt");
				BufferedOutputStream bout = new BufferedOutputStream(fout);
				String s="its a Thursday Test";
				byte b[]=s.getBytes();
				bout.write(b);
				bout.flush();
				bout.close();
				bout.close();
				System.out.println("Thursday Test is done");
				
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
	}
}
