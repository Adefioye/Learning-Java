import java.util.ArrayList;


public class Main {

	public static void main(String[] args) {
		
		/*
		 * Wrapper classes provide a way to use primitive data types as reference data types.
		 * Reference data types contain useful methods for manipulating data
		 * 
		 *	//Primitive		//Reference
		 *	------------ 	------------
		 *	1. int 			Integer
		 *	2. char 		Character
		 *	3. double 		Double
		 *	4. boolean 		Boolean
		 *
		 *	// Autoboxing is the automatic conversion of primitive to corresponding object wrapper class
		 *	// Unboxing is the reverse of autoboxing. Converting wrapper class to primitive data type
		 * 
		 * */
		
		// Autoboxing is featured below as primitive is implicitly converted to reference data type
//		Boolean a = true;
//		Integer b = 123;
//		Character c = '@';
//		Double d = 3.14;
//		String e = "Koko";
		
		// In the comparison made below, unboxing can be found in action as reference data type is implicitly
		// converted to primitive data type
		
//		if (a == true) {
//			System.out.println("This is a truthy expression");
//		}
		
		
		// ARRAYLIST
		
		/*
		 * 	Arraylist: Is a resizable array 
		 * 				Elements can be added or removed after compilation phase
		 * 				Stores reference data types
		 * */
		
//		ArrayList<String> food = new ArrayList<String>();
		
		// To add values in array list
//		food.add("Fufu");
//		food.add("pizza");
//		food.add("semovita");
		
		// TO change value in a certain index
//		food.set(0, "Wheat");
		
		// To remove an item in array list
//		food.remove(2);
		
		// To remove all items in the array list
//		food.clear();
		
//		for (int i = 0; i < food.size(); i++) {
//			System.out.println(food.get(i));
//		}
		
		// Create 2D array list
//		ArrayList<ArrayList<String>> groceryList = new ArrayList();
//		
//		ArrayList<String> bakeryList = new ArrayList();
//		
//		bakeryList.add("donut");
//		bakeryList.add("garlic bread");
//		bakeryList.add("pasta");
//		
//		System.out.println(bakeryList);
//		
//		ArrayList<String> produceList = new ArrayList();
//		
//		produceList.add("tomatoes");
//		produceList.add("zucchini");
//		produceList.add("peppers");
//		
//		System.out.println(produceList);
//		
//		ArrayList<String> drinksList = new ArrayList();
//		
//		drinksList.add("soda");
//		drinksList.add("coffee");
//		
//		System.out.println(drinksList);
		
		// Add items to grocery list
//		groceryList.add(bakeryList);
//		groceryList.add(produceList);
//		groceryList.add(drinksList);
//		
//		System.out.println(groceryList);
//		
		
		// FOR-EACH loop
		
//		String[] animals = {"cat", "dog", "zebra", "lion"};
		
		ArrayList<String> animalList = new ArrayList<String>();
		
		animalList.add("cat");
		animalList.add("dog");
		animalList.add("zebra");
		animalList.add("lion");
		
		
		for (String i : animalList) {
			System.out.println(i);
		}
//		
	}

}
