import java.util.List;
import java.util.ArrayList;
class College{
private String name;
ArrayList<Student> studentList;
public College(String name)  //to assign college name
{     this.name = name;  }
public void setStudentList(ArrayList students)  //To set Students list
{      
     this.studentList = students;
}
public String getName()
{    return this.name;  }
public List<String> getStudentList() //To get students list
{   List<Student> students = this.studentList;
 List<String> names = new ArrayList<String>();
 for(Student student : students)
 {       names.add(student.getName());   }
 return names;
}  }


class Student{
private String name;
College c;
 public Student(String name)
{
  this.name = name;
}
public String getName()
{
  return this.name;
}
}
public class Main1 {

	public static void main(String[] args) {
		College college1 = new College("CDAC TVM");
		College college2 = new College("CDAC Kochi");
		Student student1 = new Student("Bhagya");	
		Student student2 = new Student("Pratik");
	    Student student3 = new Student("Abraham");
	    ArrayList<Student> sTVM = new ArrayList<Student>();
	    ArrayList<Student> sKochi = new ArrayList<Student>();
	    sTVM.add(student1);
	    sKochi.add(student2);
	    sTVM.add(student3);
		 college1.setStudentList(sTVM);
		 college2.setStudentList(sKochi);
		 System.out.println("The students studying in " + college1.getName() + " college are " + college1.getStudentList());
		 System.out.println("The students studying in " + college2.getName() + " college are " + college2.getStudentList());


	}

}
