package Example;

public class Strings {
	
	static void stringbuffer(StringBuffer s1) {
        System.out.println("size "+s1.length());
		
		s1.append("Welcome");
		System.out.println(s1);
		
		s1.insert(11, " ");
		System.out.println(s1);

	}
	static void stringbuilder(StringBuilder s2) {

		
		s2.replace(0, 5, "happy ");
		System.out.println(s2);
		
		s2.reverse();
		System.out.println(s2);
		
	}

	public static void main(String[] args) {
		
		String str= new String("Hello World");
		StringBuffer s1=new StringBuffer(str);
        StringBuilder s2=new StringBuilder("Good morning to all.....");
		
		stringbuffer(s1);
		stringbuilder(s2);
		
		
	}
}
