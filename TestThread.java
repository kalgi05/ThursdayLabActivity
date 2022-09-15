package ThursdayLabTest;

class Square extends Thread
{
	int a;
	Square(int b)
	{
		a=b;
		
	}
	public void ans()
	{
		int sqr=a*a;
		System.out.println("sqaure of a is: "+a+" ="+sqr);
	}
}
class Cube extends Thread
{
	int x;
	Cube(int y)
	{
		x=y;
	}
	public void run()
	{
		int cube = x*x*x;
		System.out.println("cube of x is:"+x+" ="+cube);
	}
}
class Number extends Thread

{

 public void run()

 {

      Number n=new Number();

 for(int i =0; i<6; i++)

 {

 int numberInteger = Number.nextInt(10);

 System.out.println("Random Integer generated : " + numberInteger);

 Square s = new Square(numberInteger);

 s.start();

 Cube c = new Cube(numberInteger);

 c.start();

 try {

 Thread.sleep(2000);

} catch (InterruptedException ex) {

 System.out.println(ex);

}

 }

 }



}
public class TestThread {

	public static void main(String[] args) {
		
		Number n1=new Number();
		n1.start();

	}

}
