//shape example

package ThursdayLabTest;

public class TestShape {
	private String color;
	private boolean filled;
	
	public TestShape()
	{
		color="green";
		filled=true;
	}
	public TestShape(String color,boolean filled)
	{
		this.color=color;
		this.filled=filled;
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isFilled() {
		return filled;
	}
	public void setFilled(boolean filled) {
		this.filled = filled;
	}



	@Override
	
	public String toString()
	{
		if(this.filled==true)
		{
			return "shape with color"+this.color+"and filled";
		}
		else
		{
			return "shape with color"+this.color+" and not filled";
		}
	}
public class Circle extends TestShape
{
	double getArea()
	{
		return 0;
	}
}
class Rectangle extends TestShape
{
	int length;
	int width;
	Rectangle (int length,int width)
	{
		this.length=length;
		this.width=width;
	}
	double getArea()
	{
		return 0;
	}
}
public class square extends Rectangle
{
	square()
	{
		super(10,10);
		System.out.println("length:"+super.length);
		System.out.println("width:"+super.width);
	}
}
	
	
	public static void main(String[] args) {
		
			TestShape s=new TestShape();
			
		}
		
	}



