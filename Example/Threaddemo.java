package Example;

public class Threaddemo extends Thread{

 	
	public void run()
 	{
  		System.out.println("Threaddemo started running..");
  		System.out.println("Running successfully");
    }
 	public static void main( String args[] )
 	{
  		Threaddemo thread = new  Threaddemo();
  		thread.start();
  		
 	}
}
