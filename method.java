package Assignment;

public class method {
	
    public void area(int a,int b)
    {
         System.out.println("Area of rectangle : "+(a*b));
    }
    public void area(int c ) 
    {
         System.out.println("Area of square : "+(c*c));
    }

    public static void main(String args[])
   {

       method ob=new method();
       ob.area(5,8);
       ob.area(6);  
   }
}
