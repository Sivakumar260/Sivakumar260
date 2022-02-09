package Example;

public class SleepWaitdemo
{
    private static Object LOCK = new Object();
    public static void main(String args[]) throws InterruptedException
    {
        Thread.sleep(2000);
        System.out.println("Thread '" + Thread.currentThread().getName() + "' is started to working after 2 seconds");
        synchronized (LOCK) 
        {
            LOCK.wait(2000);
            System.out.println("Object '" + LOCK + " working after  " + " waiting for 2 second");
        }
    }
}

