//find the area and perimeter of a circle
class circle
{
	private float radius,perimeter,area;
        private final float PI=3.1415f;
	public circle(float v)
	{
		radius=v;
	}
  	public circle()
	{
		radius=10.5f;
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
	{
		System.out.println("Radius of the Circle is : "+radius);
		System.out.println("Perimeter of the Circle is : "+perimeter);
		System.out.println("Area of the Circle is : "+area);
	}
	public static void main(String s[])
	{
		circle c1=new circle(34.5f);
		c1.findPerimeter();
		c1.findArea();
		c1.showValues();
	}
	
}

