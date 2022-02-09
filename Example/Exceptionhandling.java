package Example;

import java.util.Scanner;

public class Exceptionhandling {

	static void check(int a,int b) throws Calculationexception
	{
		if(a==0 || b==0)
			throw new Calculationexception("User can not divide a number by zero");
		else
			System.out.println("The result is "+a/b);
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		try {
			check(a,b);
			
		} catch (Calculationexception e) {
			
			System.out.println(e);
		}
	}
}

