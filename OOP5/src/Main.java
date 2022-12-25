import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Polymorphism
		
//		Car car = new Car();
//		Bicycle bicycle = new Bicycle();
//		Boat boat = new Boat();
//		
//		Vehicle[] racers = {car, bicycle, boat};
//		
//		for (Vehicle x: racers) {
//			x.go();
//		}
		
		// Dynamic polymorphism (Polymorphism during runtime (i.e after compilation phase))
		// Demonstrated using Animal, Dog and Cat Class
		
		Scanner scanner = new Scanner(System.in);
		Animal animal;
		int choice;
		
		System.out.print("What animal do you want? Press (1 for dog) and (2 for cat): ");
		choice = scanner.nextInt();
		
		if (choice == 1) {
			animal = new Dog();
			animal.speak();
		}
		else if (choice == 2) {
			animal = new Cat();
			animal.speak();
		}
		else {
			animal = new Animal();
			System.out.println("Invalid user input... Try 1 or 2");
			animal.speak();
		}
		
		scanner.close();
		
	}

}
