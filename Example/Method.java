package Example;

public class Method {

    public String display(String name)
    {
        return("my name is "+name);
    }

    public int cube(int n)
    {
        return n*n*n;
    }

    public String fullName(String first,String last)
    {
        return first+" "+last;
    }
    public static void main (String [] args) {
    	
    	Method obj =new Method();
    	String name=obj.display("siva");
    	
    	obj.cube(5);
    	System.out.println("cube is "+obj.cube(7));
    	System.out.println(obj.display("kumar"));
    	System.out.println("My full name is "+obj.fullName("siva", "kumar"));
    	
                      
    }
}
