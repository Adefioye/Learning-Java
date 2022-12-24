
public class Main {

	public static void main(String[] args) {
		/*
		 * 	printf() : This is an optional way of controlling, formatting and displaying text
		 * 				on the console window.
		 * 				Two arguments: string + (object, variable, value)
		 * 				% [flags] [precision] [width] [conversion-character]
		 *
		 * */
		
		boolean myBoolean = true;
		int myInt = 123000000;
		double myDouble = -4.56;
		char myCharacter = '@';
		String myString = "Koko";
		
		// Conversion-character (This comes after the % symbol below such as b, d, f, c, s)
//		System.out.printf("My boolean is: %b \n", myBoolean);
//		System.out.printf("My integer is: %d \n", myInt);
//		System.out.printf("My double is: %f \n", myDouble);
//		System.out.printf("My character is: %c \n", myCharacter);
//		System.out.printf("My string is: %s", myString);
		
		// [width]: Minimum number of characters to written out as output
//		System.out.printf("Hello %10s", myString);
		
		// [precision]: Sets the number of precision when outputting floating-point values
//		System.out.printf("%7f", myDouble);
		
		// [flags]
		// adds an effect to output based on flag added to format specifier
		// -: left-justify
		// +: output a plus (+) or minus (-) sign for numeric value
		// 0: Numeric values are zero-padded
		// ,: Comma-grouping separator, if numbers > 1000
		//
		
		// To use - flag, values are left-justified
//		System.out.printf("%-7f", myDouble);
		
		// To add sign to values, use + flag (works for either positive/ negative number)
//		System.out.printf("%020f", myDouble);
//		System.out.printf("%,d", myInt);
		
		// Final KEYWORD, 
		// Essential for ensuring object cannot be changed
		
		final double PI = 3.14;
		
//		PI = 0; Error generated for re-assignment
		
		System.out.println(PI);
	}

}
