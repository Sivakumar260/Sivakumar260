package Example;

import java.util.Scanner;

public class throwdemo {
	    public static void main(String[] args)
	    {
            Scanner sc=new Scanner(System.in);
            int a=sc.nextInt();
            int b=sc.nextInt();
            int result;

	        try
	        {
	            if(b==0)        
	                throw(new ArithmeticException("Can't divide by zero."));
	            else
	            {
	                result = a / b;
	                System.out.print("\nThe result is : " + result);
	            }
	        }
	        catch(ArithmeticException Ex)
	        {
	            System.out.print("\nError : " + Ex.getMessage());
	        }
	        finally {
	        	 System.out.print("\nEnd of program.");
	    }
	   
	    	
	    }
	}

