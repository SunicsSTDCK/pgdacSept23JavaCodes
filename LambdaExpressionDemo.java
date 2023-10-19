interface MyName{  
    public void SayMyName(String s); 
   
}  
public class LambdaExpressionDemo {  
  	public static void main(String[] args) {  
       
        //implementing with lambda 
        MyName p2 = (name) -> {  
            System.out.println(name);  
        };
    
        // function call.
        p2.SayMyName("Sunitha");  
		p2.SayMyName("Krushna"); 
		MyName p3 = (a1) -> {  
            int b=30;
			int a=Integer.parseInt(a1);
			if(a>b)
				System.out.println("Biggest Value is "+a);
			else
				System.out.println("Biggest Value is "+b);
		};
		p3.SayMyName("60"); 
		// Lambda expression gives me a facility to change the 
		//implementation of a function during runtime.
		
    }  
} 