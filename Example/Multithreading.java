package Example;

public class Multithreading implements Runnable {
	public synchronized  void run() {
		for(int i=1;i<=5;i++) {
			System.out.println(i+" "+Thread.currentThread().getName());
			try {
				Thread.sleep(1000);
			}catch(Exception e) {
				System.out.println(e);
			}
		}
	}
    public static void main(String[] args) {
		Multithreading a = new Multithreading();
		Multithreading b = new Multithreading();
		
		Thread c = new Thread(a);
		Thread d = new Thread(b);
		
		c.setName("first");
		d.setName("second");
		
		c.start();
		d.start();
	}

}

