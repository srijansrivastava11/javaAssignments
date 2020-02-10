package Assignment5;

import java.util.Scanner;

public class NonRepeating {
	static final int NO_OF_CHARS = 256; 
	static char count[] = new char[NO_OF_CHARS]; 
	
	/* calculate count of characters 
	in the passed string */
	static void getCharCountArray(String str) 
	{ 
		for (int i = 0; i < str.length(); i++) 
			count[str.charAt(i)]++; 
	} 
	
	/* The method returns index of first non-repeating 
	character in a string. If all characters are repeating 
	then returns -1 */
	static int firstNonRepeating(String str) 
	{ 
		getCharCountArray(str); 
		int index = -1, i; 
	
		for (i = 0; i < str.length(); i++) 
		{ 
			if (count[str.charAt(i)] == 1) 
			{ 
				index = i; 
				break; 
			} 
		} 
	//System.out.println("index->"+index);
	return index; 
	} 

	public static void main (String[] args) 
	{ 
		Scanner scanner = new Scanner(System.in);
	    System.out.print("Enter string : ");
	    String str = scanner.nextLine();
	    scanner.close();
		int index = firstNonRepeating(str); 
		
		System.out.println(index == -1 ? "Either all characters are repeating or string " + 
				"is empty" : "First non-repeating character is " + str.charAt(index)); 
	} 

}
