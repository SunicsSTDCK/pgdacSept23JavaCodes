interface TestInterface
{
    // abstract method
    public void square(int a);
  
    // default method
    default void show()
    {
      System.out.println("This is a Square");
    }
}
public class TestClass implements TestInterface {

	public void square(int a)
    {
        System.out.println(a*a);
    }
	
	public static void main(String[] args) {
		TestClass d = new TestClass();
        d.square(4);
  
        // default method executed
        d.show();


	}

}
