
public class human extends animal {

	@Override
	public void move() {
		System.out.println("Walks on two legs");

	}
	public human(String s, byte a)
	{
		category=s;
		age=a;
	}

}
class snake extends animal
{
	@Override
	public void move() {
		System.out.println("Crawls on its body");

	}
	public snake(String s, byte a)
	{
		category=s;
		age=a;
	}
}
class bat extends animal
{
	@Override
	public void move() {
		System.out.println("Flys on its wings");

	}
	public bat(String s, byte a)
	{
		category=s;
		age=a;
	}
}
