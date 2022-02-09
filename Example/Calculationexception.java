package Example;

public class Calculationexception extends Exception{

	private String msg;
	
	public Calculationexception(String msg) {
		
		this.msg=msg;
	}

	@Override
	public String toString() {
		return "Calculation Exception : [message=" + msg + "]";
	}
	
	
}