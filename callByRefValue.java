class callByRefValue
{
 	public static void main(String s[])
 	{
		int x=10,y=20,z=30;
		String name=new String("Java");
		System.out.println("Values inside the MAIN method, BEFORE shuffle ");
		System.out.println("x= "+x+" y= "+y+" z= "+z);
		System.out.println("Name = "+name);
		shuffle(x,y,z,name);
		System.out.println("Values inside the MAIN method, AFTER shuffle ");
		System.out.println("x= "+x+" y= "+y+" z= "+z);
		System.out.println("Name = "+name);
	}
	public static void shuffle(int x,int y, int z, String name)
	{
		int temp=x;
		x=y;
		y=z;
		z=temp;
		name="STDC";
		System.out.println("Values inside the Shuffle method ");
		System.out.println("x= "+x+" y= "+y+" z= "+z);
		System.out.println("Name = "+name);
	}
}