import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		// Testing Enum using Planet 
		Planet myPlanet = Planet.SATURN;
		
//		canILiveHere(myPlanet);
		
		// Testing usage 
		
		HashMap<String, String> countries = new HashMap<String, String>();
		
		// Add key-value pair to countries
		countries.put("USA", "Washington DC");
		countries.put("Nigeria", "Abuja");
		countries.put("Ghana", "Accra");
		countries.put("China", "Beijing");
		
		// Remove key-value pair USA
		countries.remove("USA");
		
		// Get a value of a key in hashmap
		System.out.println(countries.get("China"));
		
		// Change the value of key, Nigeria
		countries.replace("Nigeria", "FCT Abuja");
		
		// Get the size/length of hashmap
		System.out.println("The length of hashmap: " + countries.size());
		
		// Check if key is present
		System.out.println("Is key present: " + countries.containsKey("China"));
		
		// Check if value is present
		System.out.println("Is value present: " + countries.containsValue("Accra"));
		
		// Get list of keys in hashmap
		System.out.println(countries.keySet());
		
		// Get list of values in hashmap 
		System.out.println(countries.values());
		
		for (String i : countries.keySet()) {
			System.out.println(i + " = " + countries.get(i));
		}

	}
	
//	static void canILiveHere(Planet myPlanet) {
//		
//		switch (myPlanet) {
//			case EARTH:
//				System.out.println("You can live here :)");
//				System.out.println("It's planet number " + myPlanet.number);
//				break;
//			default:
//				System.out.println("You can't live here yet....");
//				System.out.println("It's planet number " + myPlanet.number);
//				break;
//		}
//	}

}
