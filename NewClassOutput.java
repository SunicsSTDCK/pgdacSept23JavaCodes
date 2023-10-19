import java.io.*; 
  
public class NewClassOutput 
{ 
    public static void main(String[] args) throws Exception 
    { 
        OutputStream geek = null; 
        try { 
  
            geek = new FileOutputStream("ABC.txt"); 
			String data= "ABCDEFG";
			byte[] dataBytes = data.getBytes();
            // Writes data to the output stream
            geek.write(dataBytes);
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