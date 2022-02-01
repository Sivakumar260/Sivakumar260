package Assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Validation {
    
	static String email;
	
	void validation(String email) {
		this.email=email;
	  }
	
	public void isvalid(boolean email) {
		if(email) {
		     System.out.println("User Authenticated");
	    }
		else {
			 System.out.println("Invalid User");
		}
	}
		
	public static void main(String[] args) {
		
		ArrayList<String> a = new ArrayList<String>();
		Validation obj = new Validation();
		
		Scanner sc = new Scanner(System.in);
		
		a.add("siva@gmail.com");
		a.add("kumar@gmail.com");
		a.add("yuva@gmail.com");
		a.add("vicky@gmail.com");
		a.add("rishi@gmail.com");
		a.add("saravana@gmail.com");
		a.add("sakthi@gmail.com");
		a.add("prakash@gmail.com");
		a.add("arun@gmail.com");
		a.add("swetha@gmail.com");
		
		
		System.out.println("Enter the email id : ");
		obj.validation(sc.next());
		
		boolean b = a.contains(email);
		obj.isvalid(b);
		
	}
}

