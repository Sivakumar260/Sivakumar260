package Example;

public class Constructor{

	int id;
	String name;
	String department;

	Constructor(int id,String name,String department)
	{
	this.id=id;
	this.name=name;
	this.department=department;
	}

	public Constructor() {
		
	}

	void display(String name,String department) {
	System.out.println(name+" "+department);
	}
	void display(int id,String name) {
		System.out.println(id+" is "+name);
	}


    public static void main(String[] args) {
	
       Constructor std3=new Constructor();
       Constructor std1=new Constructor(2,"siva","maths");
	   std1.display("siva","IT");
	   std3.display(13, "kumar");
	
	
		}
}