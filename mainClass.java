class Demo{
	int x = 10;
      int display(){
	System.out.println("x = " + x);
	return 0;
	}
}
class mainClass{
	public static void main(String[] args){
		Demo D1 = new Demo();
		System.out.println(D1);
		D1.display();
	}
}
