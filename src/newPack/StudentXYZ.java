package newPack;

public class StudentXYZ {
	String name, mobile;
	int rollNo, markLab, markAssing,markMCQ,total;
	public StudentXYZ(String n, String m, int r, int mL,int mA, int mM)
	{
		name=n; rollNo=r; mobile=m; 
		markLab=mL; markAssing=mA;
		markMCQ=mM;
		
	}
	public void findTotal()
	{
		total=markLab+markAssing+markMCQ;
	}
	public void printStudent()
	{
		System.out.println("*********Student Data*************");
		System.out.println(" Name           : "+name);
		System.out.println(" Mobile         : "+mobile);
		System.out.println(" Roll Numebr    : "+rollNo);
		System.out.println(" Marks in Lab   : "+markLab);
		System.out.println(" Assignments    : "+markAssing);
		System.out.println(" MCQs           : "+markMCQ);
		System.out.println("******************************");
		System.out.println("Total Score     : "+total);
		System.out.println("**********************************");
	}
	protected void finalize() throws Throwable
	{
		System.out.println(this+ " is going to be cleared off");
	}
}
