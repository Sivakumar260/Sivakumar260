package Example;


public class Inner {
	
	private int a = 25;
	public String b= "siva";
	
	class Outer
	{
		public void display() {
			System.out.println("value of a "+a);
			System.out.println("value of b "+b);
		}
	}
	
	public static void main(String[] args) {
		Inner obj = new Inner();
		Inner.Outer obj2 = obj.new Outer();
		
		obj2.display();
		
	}

}
