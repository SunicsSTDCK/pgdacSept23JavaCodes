class wrapperMain
{
	public static void main(String s[])
	{
		/*if(s.length==2)
		{
			int a,b, sum;
			a=Integer.parseInt(s[0]);
			b=Integer.parseInt(s[1]);
			sum=a+b;
			System.out.println("Sum of "+a+" and "+b+" is "+sum);
		}
		else
		{
		   System.out.println("Give TWO Int parameters as command line arguments");
		}*/

		/*StringBuilder s1=new StringBuilder("CDAC");
		StringBuilder s2=new StringBuilder();
		StringBuilder s3=new StringBuilder(25);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println("Capacity of s1 "+s1.capacity());
		System.out.println("Capacity of s2 "+s2.capacity());
		System.out.println("Capacity of s3 "+s3.capacity());
		s2.append("Abcfgdfgf");
		System.out.println("Capacity of s2 "+s2.capacity());
		s2.append("Bcdfghgfhgf");
		System.out.println("Capacity of s2 "+s2.capacity());
		s2.insert(3,"Cdedfgdfg");
		System.out.println(s2);
		System.out.println("Capacity of s2 "+s2.capacity());
		System.out.println(s2.reverse());*/

		String s1 = "Cat";
		String s2 = "Cat";
		String s3 = new String("Cat");
		System.out.println("s1 == s2 :"+(s1==s2));
		System.out.println("s1 == s3 :"+(s1==s3));
		System.out.println("s1.equal(s3) :"+(s1.equals(s3)));
	}
}