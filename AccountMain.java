import java.util.Scanner;
final class Account
{
	int acno;
	String name;
	float balance;
	public Account(int a, String n, float b)
	{	
		acno=a; name=n; balance=b;
	}
	protected void deposit(float amt)
	{
		balance+=amt;
		printAccount();	
	}
	protected void withdraw(float amt)
	{
		balance-=amt;
		printAccount();
	}
	public void printAccount()
	{	System.out.println("*********** Account details************");
		System.out.println("Account Number : "+acno);
		System.out.println("Customer Name : "+name);
		System.out.println("Account Balance : "+balance);
		System.out.println("***************************************");
	}
	
}
class SavingsAccount extends Account
{	public SavingsAccount(int a, String n, float b)
	{
		super(a,n,b);
	}
	public void withdraw(float amt)
	{	if(balance-amt>0)
		{
			super.withdraw(amt);
		}
		else
		{
			System.out.println("Insufficient balance");
			printAccount();
		}
		
	}
	
}
public class AccountMain
{
	public static void main(String xyz[])
	{
		int acno;
		String nme; float bal;
		Scanner s1=new Scanner(System.in);
		SavingsAccount sa[]=new SavingsAccount[3];
		for(int i=0; i<sa.length;i++)
		{
			System.out.println("Enter the Name of the Account Holder");
			nme=s1.nextLine();
			System.out.println("Enter the Account number");
			acno=s1.nextInt();
			System.out.println("Enter the Account Balance");
			bal=s1.nextFloat();
			sa[i]=new SavingsAccount(acno, nme, bal);
			s1.nextLine();
		}
		for(int i=0; i<sa.length;i++)
		{
			sa[i].printAccount();
		}
		int choice=1;
		while(choice==1)// menu based transactions
		{  System.out.println("Enter the Account number");
		   acno=s1.nextInt();
		   int opt; float amt;
		   System.out.println("1. Deposit  2. Withdraw");
		   opt=s1.nextInt();
		   System.out.println("Enter the Amount");
		   amt=s1.nextFloat();
		   for(int i=0; i<sa.length;i++)
		   {
			if(sa[i].acno==acno)// searching the account from the array
			{
				if(opt==1)
				{
					sa[i].deposit(amt);
				}
				else if(opt==2)
				{
					sa[i].withdraw(amt);
				}
				else
				{
					System.out.println("Invalid option");
					
				}
				break;
			}
		  }
		  System.out.println("Any more Transactions (0/1)");
		  choice=s1.nextInt();
		}
	}
}