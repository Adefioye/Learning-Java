
public class Main {

	public static void main(String[] args) {
		// Generics allows for creation of 1 method/class for different reference data types
		
		// Testing with array of different data types
//		Integer[] intArray = {1, 2, 3, 4, 5};
//		Double[] doubleArray = {1.1, 2.2, 3.3, 4.4, 5.5};
//		Character[] charArray = {'H', 'E', 'L', 'L', 'O'};
//		String[] stringArray = {"B", "Y", "E"};
		
		// Display elements of array of different data types
//		displayArray(intArray);
//		displayArray(doubleArray);
//		displayArray(charArray);
//		displayArray(stringArray);
		
		// Get first item in arrays of different data types
//		System.out.println(getFirstItem(intArray));
//		System.out.println(getFirstItem(doubleArray));
//		System.out.println(getFirstItem(charArray));
//		System.out.println(getFirstItem(stringArray));
		
		// Testing Generic Class
		MyGenericClass<Integer> myInteger = new MyGenericClass<Integer>(2);
		MyGenericClass<Double> myDouble = new MyGenericClass<Double>(2.2);
		MyGenericClass<String> myString = new MyGenericClass<String>("Bye");
		MyGenericClass<Character> myChar = new MyGenericClass<Character>('@');
		
		System.out.println(myInteger.getValue());
		System.out.println(myDouble.getValue());
		System.out.println(myString.getValue());
		System.out.println(myChar.getValue());

	}
	
	// Create a generic method for displaying array of different data types
//	public static <T> void displayArray(T[] array) {
//		
//		for (T item : array) {
//			System.out.print(item + " ");
//		}
//		System.out.println();
//	}
//	
//	public static <T> T	getFirstItem(T[] array) {
//		return array[0];
//	}
//	
}
