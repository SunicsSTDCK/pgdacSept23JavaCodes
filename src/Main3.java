interface Sample{
    // abstract method
    int calculate(int val);
}

public class Main3 {

	public static void main(String[] args) {
		// implementing the abstract method of the interface
        Sample solution = (int val) -> val+51;
        
        // calling the method
        System.out.println("Ans = "+ solution.calculate(51));
        Sample solution1 = (int val) -> val-50;
        
        // calling the method
        System.out.println("Ans = "+ solution1.calculate(200));

	}

}
