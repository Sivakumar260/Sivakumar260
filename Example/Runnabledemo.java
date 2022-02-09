package Example;

public class Runnabledemo implements Runnable{
	 
    public static int myCount = 0;
    public Runnabledemo(){
         
    }
    public void run() {
        while(Runnabledemo.myCount <= 10){
            try{
                System.out.println("Expl Thread: "+(++Runnabledemo.myCount));
                Thread.sleep(100);
            } catch (InterruptedException iex) {
                System.out.println("Exception in thread: "+iex.getMessage());
            }
        }
    } 
    public static void main(String a[]){
        System.out.println("Starting Main Thread...");
        Runnabledemo thread = new Runnabledemo();
        Thread t = new Thread(thread);
        t.start();
        while(Runnabledemo.myCount <= 10){
            try{
                System.out.println("Main Thread: "+(++Runnabledemo.myCount));
                Thread.sleep(100);
            } catch (InterruptedException iex){
                System.out.println("Exception in main thread: "+iex.getMessage());
            }
        }
        System.out.println("End of Main Thread...");
    }
}

