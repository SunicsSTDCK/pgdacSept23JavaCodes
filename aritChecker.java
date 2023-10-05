class arithmetic
{
	public int add(int a, int b)// function overloading
	{
		return a+b;
	}
	public int Sub(int a, int b)// function overloading
	{
		return a-b;
	}
	public int add(int a, int b, int c)
	{
		return a+b+c;
	}
	public int Sub(int a, int b, int c)// function overloading
	{
		return a-b-c;
	}
	public float add(float a, float b)
	{
		return a+b;
	}
	public float add(float a, float b, float c)
	{
		return a+b+c;
	}
	public float add(float a, int b, int c)
	{
		return a+b+c;
	}
}
public class aritChecker
{
	public static void main(String args[])
	{
		arithmetic a1=new arithmetic();
		System.out.println("Sum is "+a1.add(30,40));
		System.out.println("Sum is "+a1.add(30.56f,40.343f));
		System.out.println("Sum is "+a1.add(30,40,78));
		System.out.println("Sum is "+a1.add(30.454f,40,78));
		System.out.println("Difference is "+a1.Sub(90,40));
		System.out.println("Difference is "+a1.Sub(90,40,10));
	}
}