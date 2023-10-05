public class AccessTest
{
	private int a;
	protected int b;
	public int c;
	int d;
	public void addValues()
	{
		a=10; b=230; c=34; d=67;
		print();
	}
	public void show()
	{
		System.out.println("A is "+a+" B is "+b+" C is "+c+" D is "+d);
	}
	private void print()
	{
		System.out.println("A is "+a+" B is "+b+" C is "+c+" D is "+d);
	}

}

