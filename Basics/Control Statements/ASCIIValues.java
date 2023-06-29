import java.util.Scanner;

public class ASCIIValues {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any Character: ");
		String input = sc.next();
		char ch = input.charAt(0);	
		
		int asciiValue = (int) ch;	//explicit type conversion
		
		System.out.println("The ASCII value of " + ch + " is: " + asciiValue);
		
		
		System.out.println("Enter ASCII Value: ");
		int number = sc.nextInt();
		
		char ascii = (char) number;
		
		
		System.out.println("The ASCII Value " + number + " is of: " + ascii);
		
	}
}