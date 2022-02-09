package Example;

class MyException extends Exception 
{ 
    public MyException(String s) 
    { 
        super(s); 
    } 
} 
public class customexception 
{ 
	
    public static void main(String args[]) 
    { 
        try
        { 
            throw new MyException("siva"); 
        } 
        catch (MyException ex) 
        { 
            System.out.println("kumar"); 
            System.out.println(ex.getMessage()); 
        } 
    } 
}

