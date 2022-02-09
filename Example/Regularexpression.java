package Example;

import java.util.regex.*;

public class Regularexpression {

public static void main(String[] args) {

	String pattern = "[a-z]+";
	String check = "Hello,Good Morning Everyone......";
	Pattern p = Pattern.compile(pattern);
	Matcher c = p.matcher(check);
	
	while (c.find())
      	System.out.println( check.substring( c.start(), c.end() ) );
	}
}
