package Package1;
import Package2.*;

public class A {
	
	protected String protectedMessage = "This is protected";
	
	private String privateMessage = "This is private";
	
	public static void main(String[] args) {
		
		A a = new A();
		
		System.out.println(a.privateMessage);
	}
	

}
