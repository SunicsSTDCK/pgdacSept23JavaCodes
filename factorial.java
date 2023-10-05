import java.util.Scanner;
class factorial
{
	public static void main(String s[])
	{
		int n, fact;
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter the Number for which factorial to be calculated");
		n=sc1.nextInt();
		fact=factCalc(n);
		System.out.println(n+"! = "+fact);
	}
	public static int factCalc(int a)
	{
		        if (a != 0)  // termination condition
            			return a * factCalc(a-1); // recursive call
       			 else
           			 return 1;

	}
}