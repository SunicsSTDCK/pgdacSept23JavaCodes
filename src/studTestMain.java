import newPack.*;

class Studentabc {
	String name, mobile;
	int rollNo, markLab, markAssing,markMCQ,total;
	public Studentabc(String n, String m, int r, int mL,int mA, int mM)
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
public class studTestMain {

	public static void main(String[] args) {
		Studentabc stud1=new Studentabc("ABCD", "12345567", 1, 20,25, 30);
		stud1.findTotal();
		stud1.printStudent();
		
		Studentabc stud2=stud1;
		stud1=null;
			
		
		System.gc();
		

	}

}
