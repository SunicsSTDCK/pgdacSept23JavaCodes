class test
{
	int val;
	String text;
	public test()
	{
		text="CDAC";
	}
}
class test1 extends test
{
	int val2;
	public test1(int a, int b, String c)
	{
		val=a; text=c; val2=b;
	}
	public test1()
	{
		super();
	}
	public test1(test1 t)
	{
		this.val=t.val;
		this.text=t.text;
		this.val2=t.val2;
	}
	public void print()
	{
		System.out.println("Val = "+val);
		System.out.println("Val2 = "+val2);
		System.out.println("Text = "+text);
	}
}
public class test1Main
{
	public static void main(String a[])
	{
		test1 t1=new test1();
		test1 t2=new test1(12,20,"STDC");
		test1 t3=new test1(t2);
		t1.print();
		t2.print();
		t3.print();
	}
}