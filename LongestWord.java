// display "longest word"  in your text file

package ThursdayLabTest;

import java.io.FileWriter;
import java.io.Writer;

public class TestLongestWord {

	public static void main(String[] args) {

		try
		{
			Writer w=new FileWriter("D:\\textfile1.txt");
			String Content="Longesttt Word";
			w.write(Content);
			w.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		


	}

}
