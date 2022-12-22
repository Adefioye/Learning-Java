
public class Main {
	
	public static void main(String[] args) {
		
		// Representing an array
		// Method 1 for creating an array
//		String[] cars = {"Tesla", "BMW", "GM"};
//		
//		System.out.println(cars[0]);
		
		// Method 2 for creating an array
//		String[] cars = new String[3];
//		
//		cars[0] = "Tesla";
//		cars[1] = "BMW";
//		cars[2] = "GM";
//		
//		for (int i = 0; i < cars.length; i++) {
//			System.out.println(cars[i]);
//		}
		
		// Create 2-D Array
		String[][] cars = {
				{"a", "b", "c"},
				{"d", "e", "f"},
				{"g", "h", "i"},
		};
		
		for (int i = 0; i < cars.length; i++ ) {
			
			for (int j = 0; j < cars[i].length; j++) {
				
				System.out.print(cars[i][j] + " | ");
			}
			System.out.println();
		}
	}
}
