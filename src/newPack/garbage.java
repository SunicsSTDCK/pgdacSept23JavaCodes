package newPack;

public class garbage {

	public static void main(String[] args) {
		Integer i=new Integer(5);
		Integer j=10;// auto boxing
		System.out.println(i.intValue()+j.intValue());// unboxing
		Float f=10.45f;// auto boxing
		float val=f.floatValue();// unboxing
		
	}

}
