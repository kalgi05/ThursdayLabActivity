//Program to find palindrom or not

public class palindrome {

	public static void main(String[] args) {
			String str="mam";
			StringBuffer p= new StringBuffer();
			for (int i=str.length()-1;i>=0;i--)
			{
				p=p.append(str.charAt(i));
				
			}
			if(str.equalsIgnoreCase(p.toString())) {
				System.out.println("its a palindrom");
				
			}
			else
			{
				System.out.println("its not palindrom");
			}
	}

}
