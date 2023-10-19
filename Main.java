
import java.io.*;

class stud implements Serializable
{
	int rollNo;
	String name;
	String course;
	int mark;
	String grade;
	public stud(int r,String n, String c, int m, String g)
	{
		rollNo=r;
		name=n;
		course=c;
		mark=m;
		grade=g;
	}
	public void print()
	{
		System.out.println("Roll No    : "+rollNo);
		System.out.println("Name       : "+name);
		System.out.println("Course     : "+course);
		System.out.println("Mark       : "+mark);
		System.out.println("Grade      : "+grade);
	}
}
public class Main {
    public static void main(String[] args) {
 
	
        try {

            FileOutputStream file = new FileOutputStream("student.txt");
			
            // Creates an ObjectOutputStream
            ObjectOutputStream output = new ObjectOutputStream(file);
			System.out.println("Output Object Stream created");
			stud s1=new stud(20,"sunitha","PG-DAC",78,"B+");
			stud s2=new stud(30,"Rahul","PG-DAC",98,"A+");
            // writes objects to output stream
            output.writeObject(s1);
            output.writeObject(s2);
			System.out.println("Saved Objects to file");
			output.close(); 
			file.close();
			
            // Reads data using the ObjectInputStream
            FileInputStream fileStream = new FileInputStream("student.txt");
            ObjectInputStream objStream = new ObjectInputStream(fileStream);
			System.out.println("file openend in input mode");
			stud s3=(stud)objStream.readObject(); //Object
			stud s4=(stud)objStream.readObject(); //Object
            s3.print();
			s4.print();

            
            objStream.close();
        }

        catch (Exception e) {
            e.getStackTrace();
        }
    }
}