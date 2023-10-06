class Parent {
	String name;
	void method(){
		System.out.println("Method from Parent");
	}
	void tester()
	{
		System.out.println("this is tester()of parent");
	}
}
class Child extends Parent {
	//int id;
	void method()
	{System.out.println("Method from Child");
	}
	/*void childMethod()
	{
		System.out.println("this is childMethod() of child");
	}*/
}
public class casting {

	public static void main(String[] args) {
		/*Parent p = new Child();
		p.name = "Parent Name";
		System.out.println(p.name);
		p.method();
		p.tester();*/
		Parent p1=new Parent();
		p1.name="PGDAC";
		
	//	Child c = new Parent(); - > compile time error
		//Child c = (Child)p1;
		//c.id = 1;
		//System.out.println(c.name);
	//	System.out.println(c.id);
	//	c.method();
	//	c.tester();
		//c.childMethod();
		Object o=new Object();
		Parent o1=(Parent)o;
		o1.toString();
	}

}
