import java.io.*; 
  
public class bufferedReaderFile 
{ 
    public static void main(String[] args) throws Exception 
    { 
        BufferedReader geek = null; 
        try { 
  
            geek = new BufferedReader(new FileReader("ABC.txt")); 
			geek.skip(2);
			System.out.println(geek.readLine()); 
            
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