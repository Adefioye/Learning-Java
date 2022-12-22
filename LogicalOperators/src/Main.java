import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// AND operator
		
//		int age = 10;
//		
//		if (age > 30) {
//			System.out.println("It's hot outside!");
//		}
//		else if (age >= 20 && age <= 30) {
//			System.out.println("It's warm outside!");
//		}
//		else {
//			System.out.println("It's cold outside!");
//		}
		
		// OR operator = || and AND = && and NOT = !
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("You are playing a game. Enter q or Q to quit: ");
		String response = scanner.next();
		
		if (!response.equals("q") && !response.equals("Q")) {
			
			System.out.println("You are still playing the game *pew pew*");
		}
		else {
			System.out.println("You quit the game!");
		}
		
		scanner.close();

	}

}
