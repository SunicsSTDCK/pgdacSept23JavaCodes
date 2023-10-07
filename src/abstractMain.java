
public class abstractMain {

	public static void main(String[] args) {
		/*//animal a1=new animal();
		byte a=12;
		human h1=new human("Human",a);
		a=2;
		snake s1=new snake("Snake",a);
		a=5;
		bat b1=new bat("Bat", a);
		h1.printData();h1.move();
		s1.printData();s1.move();
		b1.printData();b1.move();*/
		byte a=12;
		humanClass h1=new humanClass("Human", a);
		a=5;
		batClass b1=new batClass("Bat", a);
		h1.printData();h1.move();
		b1.printData();b1.move();
	}

}
