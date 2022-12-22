import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		Random random = new Random();
		
		// Generates pseudo-code btw near -2billion and +2billion
//		int x = random.nextInt();
		
		// Generate values between 0 and 7
//		int x = random.nextInt(8);
		
		// Generate values in a 6-sided dice
//		int x = random.nextInt(6) + 1;
		
		// Generate pseudo-random double values
//		double x = random.nextDouble();
		
		// Generate pseudo-random boolean values
		boolean x = random.nextBoolean();
		
		System.out.println(x);
		
		
	}
}
