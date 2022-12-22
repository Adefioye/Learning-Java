import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
//		Scanner scanner = new Scanner(System.in);
//		String name = "";
		
		// While loop
		
//		while (name.isBlank()) {
//			System.out.print("Enter your name: ");
//			name = scanner.nextLine();
//		}
//		
//		System.out.println("Hello " + name);
		
		// Do-while
		
//		do {
//			System.out.print("Enter your name: ");
//			name = scanner.nextLine();
//		} while (name.isBlank());
//		
//		System.out.println("Hello " + name);
//		
//		scanner.close();
		
		// FOR loop
//		for(int i = 0; i <= 10; i++) {
//			System.out.print(i + " ");
//		}
//		System.out.println();
//		
//		for (int i = 10; i >= 0; i--) {
//			System.out.print(i + " ");
//		}
//		System.out.println();
//		
//		for (int i = 10; i >= 0; i -= 2) {
//			System.out.print(i + " ");
//		}
//		System.out.println();

		// NESTED FOR-LOOP
		Scanner scanner = new Scanner(System.in);
		int ROWS;
		int COLS;
		String SYMBOL;
		
		System.out.print("Enter # of rows: ");
		ROWS = scanner.nextInt();
		
		System.out.print("Enter # of cols: ");
		COLS = scanner.nextInt();
		
		System.out.print("Enter symbol: ");
		SYMBOL = scanner.next();
		
		System.out.println("Display content of rows and columns");
		for (int row = 0; row < ROWS; row++) {
			
			for (int col = 0; col < COLS; col++) {
				System.out.print(SYMBOL + " | ");
			}
			System.out.println();
		}
		
		scanner.close();
	}

}
