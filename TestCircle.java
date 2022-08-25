package ThursdayLabTest;

class circle
{
	double PI=3.14;
	double radius;
	
	public circle()
	{
		radius=2;
		
	}
	public circle(double r)
	{
		radius=r;
	}
	public void setRadius(double r)
	{
		radius=r;
	}
	public double getRadius()
	{
		return radius;
	}
	public double getCenter()
	{
		return PI*radius*radius;
	}
}

public class TestCircle {

	public static void main(String[] args) {
		circle c=new circle();
		circle c1=new circle(3.5);
		
		System.out.println("area of first obj circle with radius "+c.getCenter());
		System.out.println("area of second obj circle with radius "+c1.getCenter());
		c.setRadius(1.5);
		System.out.println("area of first obj circle with radius "+c.getCenter());
		

	}

}
