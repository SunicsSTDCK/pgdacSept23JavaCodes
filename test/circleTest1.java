//find the area and perimeter of a circle
import java.util.Scanner;// selective inclution /// import java.util.*
class circle1
{
	private float radius,perimeter,area;
        private float PI=3.1415f;
	String cirName;
	public void setValues(float v, String s)
	{
		radius=v;
		cirName=s;
	}
	public void findPerimeter()
	{
		perimeter=2*PI*radius;
	}
	public void findArea()
	{
		area=PI*radius*radius;
	}
	public void showValues()
	{	System.out.println("Name of the Circle is : "+cirName);
		System.out.println("Radius of the Circle is : "+radius);
		System.out.println("Perimeter of the Circle is : "+perimeter);
		System.out.println("Area of the Circle is : "+area);
	}
	
}
public class circleTest1
{

	public static void main(String s[])
	{
		circle1 c1=new circle1();// implicit call to the no argument //constructor(default)
		Scanner s1=new Scanner(System.in); //cin>>r;
		System.out.println("Enter the Name of the circle");
		String nme=s1.nextLine();
		System.out.println("Enter the Radius of the circle");
		float r=s1.nextFloat();
		c1.setValues(r, nme);
		c1.findPerimeter();
		c1.findArea();
		c1.showValues();
	}
}