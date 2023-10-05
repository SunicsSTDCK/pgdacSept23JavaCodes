//find the area and perimeter of a circle
class circle
{
	private float radius,perimeter,area;
        private float PI=3.1415f;
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
		circle c2=new circle();
		circle c3= new circle(90.12f);
		circle c4=new circle();
	}
	
}

