package Example;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;


public class maps{

	public static void main(String[] args) {

		HashMap<Integer,String> map=new HashMap<Integer,String>();      
	      map.put(1,"siva");    
	      map.put(2,"kumar");    
	      map.put(3,"harish");   
	      map.put(4,"viknesh"); 
	      System.out.println("The names are ");  
	      System.out.println(map);
	      System.out.println("To get the value of specific key= "+ map.get(2));
	      map.put(5,"rakshana");
	      System.out.println("The new map is "+map);
	    

	      TreeMap<Integer,String> map2=new TreeMap<Integer,String>();    
	      map2.put(6,"bread");    
	      map2.put(7,"egg");    
	      map2.put(8,"milk");       
	      
	      System.out.println("\nThe dairy products are ");  
	      for(Map.Entry l:map2.entrySet()){    
	       System.out.println(l.getKey()+" "+l.getValue());    
	      }    
	      
	   }  
}
