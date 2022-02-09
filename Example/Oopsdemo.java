package Example;

import java.util.Scanner;

class Oopsdemo
{   
	private static int x;
	private static int y;
	
	public Oopsdemo(int x,int y) {
		this.x=x;
		this.y=y;
	}
    public int sum(int x, int y) 
    { 
        return (x + y); 
    } 
    public int sum(int x, int y, int z) 
    { 
        return (x + y + z); 
    } 
    public double sum(double x, double y) 
    { 
        return (x + y); 
    } 
    public static void main(String args[]) 
    { 
    	Scanner sc=new Scanner(System.in);
    	x=sc.nextInt();
    	y=sc.nextInt();
    	int z = sc.nextInt();
        Oopsdemo s = new Oopsdemo(x, y);  
        System.out.println(s.sum(x,y)); 
        System.out.println(s.sum(x,y,z)); 
    } 
}

