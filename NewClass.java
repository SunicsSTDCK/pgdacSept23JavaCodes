import java.io.*; 
  
public class NewClass 
{ 
    public static void main(String[] args) throws Exception 
    { 
        InputStream geek = null; 
        try { 
  
            geek = new FileInputStream("ABC.txt"); 
			System.out.println("Char : "+(char)geek.read()); 
            System.out.println("Char : "+(char)geek.read()); 
            System.out.println("Char : "+(char)geek.read()); 
			}
			catch(Exception excpt) 
        { 
            // in case of I/O error 
            excpt.printStackTrace(); 
        } 
        finally
        { 
            // releasing the resources back to the 
            // GarbageCollector when closes 
            if (geek!=null) 
            { 
                // Use of close() : closing the file 
                // and releasing resources 
                geek.close(); 
            } 
        } 
    } 
} 