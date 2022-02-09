package Example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch 
{
    public static void main(String args[]) 
    {
        Scanner sc=new Scanner(System.in);
    	int a=sc.nextInt();
    	int b=sc.nextInt();
        try 
        {
            int c = a/b;
        }
        catch (ArithmeticException e) 
        {
            System.out.println(e); 
        }
        catch(InputMismatchException e) {
        	System.out.println(e);
        }
        finally 
        { 
			System.out.println("Enter the correct value");
        }
    }
}

