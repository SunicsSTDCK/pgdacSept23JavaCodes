interface MyName{  
    public void SayMyName(); 
   
}  

public class LambdaExpressionExample {

	public static void main(String[] args) {
		MyName p2 = () -> {  
            System.out.println("Sunitha");  
        };
      
        // function call.
        p2.SayMyName();  
	}

}
