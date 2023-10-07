
public class humanClass implements animalIntf {
	String category;
	byte age;
	public void move() {
		System.out.println("Walks on two legs");

	}
	public humanClass(String s, byte a)
	{
		category=s;
		age=a;
	}
	public void printData()
	{
		System.out.println("The animal category is "+category+" and its age is "+age);
	}
}
class batClass implements animalIntf
{	String category;
    byte age;
	@Override
	public void move() {
		System.out.println("Flys on its wings");

	}
	public batClass(String s, byte a)
	{
		category=s;
		age=a;
	}
	public void printData()
	{
		System.out.println("The animal category is "+category+" and its age is "+age);
	}
}
