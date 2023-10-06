class Parent {
    String name;
 
    // A method which prints parent class
    void method()
    {
        System.out.println("Method from Parent");
    }
}
class Child extends Parent {
	int id;
	void method()
	{System.out.println("Method from Child");
	}
}
public class casting {
	public static void main(String[] args)
	{
	Parent p = new Child();
	p.name = "Parent Name";
	System.out.println(p.name);
	p.method();
	// Child c = new Parent(); - > compile time error
	Child c = (Child)p;
	c.id = 1;
	System.out.println(c.name);
	System.out.println(c.id);
	c.method();
	}
}

