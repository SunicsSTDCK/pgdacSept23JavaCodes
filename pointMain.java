class twoDpoint
{
	protected int x, y;
	public twoDpoint(int x,int y)
	{      
		this.x=x; // this is a keyword to point towards the current object
		this.y=y;
	}
	public void printXY()
	{
		System.out.println("X = "+x+ " Y = "+y);
	}
}
class threeDpoint extends twoDpoint
{
	protected int z;
	public threeDpoint(int x,int y, int z)
	{	super(x,y); // call to the constructor of the super/parent class. // Constructor Chaining
			//1. it should be only from the constructor of the child class.
			//2. it should be the first stmt in the constructor of the child class
		this.z=z;
		
	}
	public void printXYZ()
	{
		printXY();
		System.out.println("Z = "+z);
	}

}
public class pointMain
{
	public static void main(String s[])
	{
		 twoDpoint t1=new twoDpoint(23,60);
		twoDpoint t2=new twoDpoint(45, 12);
		//t1.setXY(23,60);
		//t2.setXY(45, 12);
		t1.printXY();
		t2.printXY();
		threeDpoint t3= new threeDpoint(10,45,78);
		//t3.setXYZ(10,45,78);
		t3.printXYZ();
	}
}