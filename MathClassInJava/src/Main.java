import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
//		double x = 3.14;
//		double y = -10;
		
//		double z = Math.max(x, y);		
//		double z = Math.abs(y);
//		double z = Math.sqrt(3.14);
//		double z = Math.round(3.14);
//		double z = Math.ceil(3.14);
//		double z = Math.floor(3.14);
		
		// Calculate the hypotenus of a right-angled triangle
		Scanner scanner = new Scanner(System.in);
		double x;
		double y;
		double z;
		
		System.out.print("Enter side x: ");
		x = scanner.nextDouble();
		
		System.out.print("Enter sise y: ");
		y = scanner.nextDouble();
		
		z = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
		
		System.out.println("The hypotenus is " + z);
		
		
		scanner.close();
		
	}
}
