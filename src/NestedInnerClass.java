class OuterClass {
  public class InnerClass {
    public void print() {
      System.out.println("I am printing from the inner class!");
    }
  }
  public void prints()
  {
	  System.out.println("I am printing from the outer class!");
  }
}

public class NestedInnerClass {

	public static void main(String[] args) {
	    OuterClass.InnerClass in =new OuterClass().new InnerClass(); 
	    in.print();
	    OuterClass o1=new OuterClass();
	    o1.prints();
	 
	}

}
