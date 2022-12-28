

public class Main {

	public static void main(String[] args) {
		
		// Testing an inner class
		Outside out = new Outside();
		
		Outside.Inside in = out.new Inside();
		
		in.greeting();
		
		

	}

}
