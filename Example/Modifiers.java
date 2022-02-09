package Example;


public class Modifiers {
	class defaultspecifier
	{ 
	  static void print() 
	     { 
	         System.out.println("This is default"); 
	     } 
	} 

    class privatespecifier 
	{ 
	   private static void print () 
	    { 
	        System.out.println("This is private"); 
	    } 
	} 

     public class protectedspecifiers {

		protected static void print() 
	    { 
	        System.out.println("This is protected "); 
	    } 
     }
	 class publicspecifier 
		{ 
		   private static void print() 
		    { 
		        System.out.println("This is public"); 
		    } 
		} 
		
     public static void main(String[] args) {
    	 
		publicspecifier.print();
		privatespecifier.print();
		defaultspecifier.print();
		protectedspecifiers.print();
	}
	}
