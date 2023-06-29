/*
1. Check whether the enetered character is vowel or consonant using switch case.
*/

import java.util.Scanner;

public class Switch_Statement {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any character: ");
		String character = sc.next();
		
		switch(character) {
			case "a":
			case "A":
			case "e":
			case "E":
			case "i":
			case "I":	
			case "o":
			case "O":
			case "u":
			case "U":	
				System.out.println("Entered Character is Vowel");
				break;
				
			default:
				System.out.println("Entered Character is a Consonant");
		}
	}
}

/*
1. Write a program that takes a month number as input (1-12) and displays the corresponding month name.

2. Create a program that asks the user to enter a shape (circle, square, triangle) and calculates the area of the chosen shape.

3. Write a program that prompts the user to enter a letter grade (A, B, C, D, or F) and provides a corresponding message (e.g., "Excellent!", "Pass", "Fail").

4. Develop a program that asks the user to enter a number (1-7) and prints the name of the day of the week.

5. Create a program that prompts the user to enter a character and determines whether it is a vowel or a consonant.

6. Write a program that takes an integer as input and checks whether it is even or odd.

7. Create a program that asks the user to enter a number (1-4) and prints the name of a season corresponding to that number.

8. Develop a program that takes a color code (R, G, B, Y) and prints the name of the corresponding color (Red, Green, Blue, Yellow).

9. Write a program that prompts the user to enter a grade percentage and determines the corresponding letter grade (A, B, C, D, or F).

10. Create a program that asks the user to enter a character and determines whether it is a digit, lowercase letter, or uppercase letter.

*/