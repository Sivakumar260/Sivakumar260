package Example;



public class Typecasting {
	
	public static void main(String[] args) {

			System.out.println("Implicit Type Casting");
			char a='S';
			System.out.println("Value of a: "+a);
			
			int b=a;
			System.out.println("Value of b: "+b);
			
			float c=a;
			System.out.println("Value of c: "+c);
			
			long d=a;
			System.out.println("Value of d: "+d);
			
			double e=a;
			System.out.println("Value of e: "+e);
		
			System.out.println("\n");
			
			System.out.println("Explicit Type Casting");

			double a1=34.8;
			int b1=(int)a1;
			System.out.println("Value of x: "+a1);
			System.out.println("Value of y: "+b1);
			
		}
	}

