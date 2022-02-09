package Example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Collections {
	
     static void Array() {
		System.out.println("ArrayList");
		ArrayList<String> email=new ArrayList<String>();   
	      email.add("siva@gmail.com");
	      email.add("kumar@gmail.com");   
	      email.add("harish@gmail.com");  
	      System.out.println(email);  
     }
     static void Linkedlist() {
	      System.out.println("\nLinkedList");
	      LinkedList<String> name=new LinkedList<String>();  
	      name.add("siva");  
	      name.add("kumar");  	
	      name.add("harish"); 
	      Iterator<String> itr=name.iterator();  
	      while(itr.hasNext()){  
	       System.out.println(itr.next()); 
	      }
	   }
	      
	  static void Hashmap() {  

	       System.out.println("\nHashmap");
	       HashSet<Integer> a=new HashSet<Integer>();  
	       a.add(1);  
	       a.add(2);  
	       a.add(3);
	       a.add(4);
	       System.out.println(a);
	   }
	   
	   static void set() {
		   System.out.println("\n Set ");
		   Set<String> set1 = new HashSet<String>();

			set1.add("siva");
			set1.add("kumar");
			set1.add("Harish");
			set1.add("rishi");
			set1.add("viknesh");

			System.out.println(set1);
	      	} 
	   
	   public static void main(String[] args) {
		Array();
		Linkedlist();
		Hashmap();
		set();
	}
	
	     
	}
