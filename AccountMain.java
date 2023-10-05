class Account
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
	{
		System.out.println("Account Number : "+acno);
		System.out.println("Customer Name : "+name);
		System.out.println("Account Balance : "+balance);
	}
	public static void prints()
	{
		System.out.println("This is printed from Parent function");
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
	public static void prints()
	{
		System.out.println("This is printed from Child function");
	}
}
public class AccountMain
{
	public static void main(String xyz[])
	{
		Account a1= new Account(1,"ABC", 1000.00f);
		SavingsAccount sa1=new SavingsAccount(2,"XYZ",50000.00f);
		a1.printAccount();
		Account.prints();
		sa1.printAccount();
		a1.deposit(400.50f);
		SavingsAccount.prints();
		a1.withdraw(6000.00f);
		sa1.withdraw(4000.00f);
		sa1.deposit(1000.00f);
		
		
	}
}