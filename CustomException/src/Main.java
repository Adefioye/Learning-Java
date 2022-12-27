import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your age: " );
		int age = scanner.nextInt();
		
		try {
			checkAge(age);
		} catch (AgeException e) {
			System.out.println("A problem occurred: " + e);
		}
		
		scanner.close();
	}
	
	static void checkAge(int age) throws AgeException{
		
		if (age < 18) {
			throw new AgeException("\n You must be 18+ old to sign up");
		}
		else {
			System.out.println("You are signed up!");
		}
	}
	

}
