import java.util.ArrayList;
import java.util.LinkedList;

public class Strings {
    public static void main(String[] args) {
        // String str = "Hello";
        // System.out.println(str.hashCode()); //hashcode is a unique number for every object
        
        // str = "World!";
        // System.out.println(str.hashCode()); //hashcode is a unique number for every object


        String str;

        // System.out.println("Enter a string: ");
        // str = System.console().readLine();
        str = "Hello, My name is John Doe. I am 26 years old. and i like to do adventures. I am a software engineer. I have 5 cars and 2 bikes. Works for Google.";
        System.out.println("\n" + str);

        //charAt()
        // System.out.println("\ncharAt(): " + str.charAt(67));

        //compareTo()
        // System.out.println("\ncompareTo(): " + "Hellow__w".compareTo("Hello"));

        //concat()
        // System.out.println("\nconcat(): " + str.concat(" Bye!!!"));

        //contains()
        // System.out.println("\ncontains(): " + str.contains("26"));

        //endsWith()
        // System.out.println("\nendsWith(): " + str.endsWith("Google."));

        //equals()
        // System.out.println("\nequals(): " + "Devji".equals("Devji"));
        // String str0 = "devji";
        // String str1 = "dev";
        // str1 = "devji";
        // System.out.println("\nequals(): " + (str0 == str1));

        //equalsIgnoreCase()
        // System.out.println("\nequalsIgnoreCase(): " + "Devji".equalsIgnoreCase("devji"));

        //format()
        // System.out.println("\nformat(): " + String.format("My name is %s and i am %d years old.", "Devji", 26));

        //getBytes()
        // System.out.println("\ngetBytes(): " + str.getBytes());

        //getChars()
        // char[] ch = new char[10];
        // ch[0] = 'R';
        // ch[1] = '_';
        // str.getChars(0, 5, ch, 2);
        // System.out.println("\ngetChars(): ");
        // for (char c : ch) {
        //     System.out.print(c);
        // }

        //indexOf()
        // System.out.println("\nindexOf(): " + str.indexOf("s.", 0));

        //intern() - this method returns the string from the pool, if it is already present in the pool. Otherwise, it adds the string to the pool and returns the reference of this string.
        // System.out.println("\nintern(): " + str.intern());

        //isEmpty()
        // System.out.println("\nisEmpty(): " + str.isEmpty());

        //join()
        // System.out.println("\njoin(): " + String.join("_", "Hello", "World", "Bye"));

        //lastIndexOf()
        // System.out.println("\nlastIndexOf(): " + str.lastIndexOf("s.", 100));

        //length()
        // System.out.println("\nlength(): " + str.length());

        //replace()
        // System.out.println("\nreplace(): " + str.replace("John Doe", "Dev Bhatt"));

        //replaceAll()
        // System.out.println("\nreplaceAll(): " + str.replaceAll("[a-c]", "_X_"));

        //split()
        // String[] strArr = str.split("[.]");
        // for (String s : strArr) {
        //     System.out.println(s);
        // }

        //startsWith()
        // System.out.println("\nstartsWith(): " + str.startsWith("Hello"));

        //substring()
        // System.out.println("\nsubstring(): " + str.substring(0, 5));

        //toLowerCase()
        // System.out.println("\ntoLowerCase(): " + str.toLowerCase());

        //toUpperCase()
        // System.out.println("\ntoUpperCase(): " + str.toUpperCase());

        //trim()
        // System.out.println("\ntrim(): \"      Dev Bhatt     \" : " + "      Dev Bhatt     ".trim());

        //valueOf()
        System.out.println("\nvalueOf(): " + String.valueOf(12.2));

        //let's check 
        Integer a = 56;
        String s = String.valueOf(a);
        System.out.println("a: " + (a instanceof Integer) + " s: " + (s instanceof String));
        System.out.println("a: " + a.getClass().getSimpleName()  + "\ns: " + s.getClass().getSimpleName());
    }
}

/*

String Methods:

1. String charAt()
2. String compareTo()
3. String concat()
4. String contains()
5. String endsWith()
6. String equals()
7. equalsIgnoreCase()
8. String format()
9. String getBytes()
10. String getChars()
11. String indexOf()
12. String intern()
13. String isEmpty()
14. String join()
15. String lastIndexOf()
16. String length()
17. String replace()
18. String replaceAll()
19. String split()
20. String startsWith()
21. String substring()
22. String toCharArray()
23. String toLowerCase()
24. String toUpperCase()
25. String trim()
26. String valueOf()

*/

/*
String Tasks:

1. String Concatenation: Modify the code to concatenate 's1', 's2', and 's3' into a single string and print the result. For example, if 's1' is "Hello," 's2' is "World," and 's3' is "Hello World," the program should output "Hello WorldHelloWorld."

2. String Length: Calculate and display the length of each string ('s1', 's2', 's3', and 's4') in characters. Ensure that the program correctly counts the number of characters in each string.

3. String Comparison: Implement a comparison mechanism to check if 's4' is equal to 's3'. If they are equal, print "s4 is equal to s3," otherwise, print "s4 is not equal to s3."

4. String Manipulation: Modify the program to take an additional user input (a string) and then check if 's3' contains the user-input string. If it does, print "s3 contains the user input," otherwise, print "s3 does not contain the user input."

5. String Case Conversion: Convert 's4' to uppercase and 's2' to lowercase. Print both modified strings. Ensure that the original strings remain unchanged.

6. Word Count: Create a program that takes a sentence as input and counts the number of words in it without using any string methods.
Example:
    Input: "Hello World"

    Output: 2

7. Password Strength Checker: Build a password strength checker that assesses a user's password based on criteria such as length, special characters, and uppercase/lowercase letters.
Example:
    Input: "HelloWorld"

    Output:
    Password length is too short.
    Password does not contain any special characters.
    Password does not contain any uppercase letters.

8. Email Validation: Implement an email validator that checks whether a given string is a valid email address without using regular expressions or string methods.
Example:
    Input: abc@gmail.com

    Output: Valid email address

    Input: abc@gmail

    Output: Invalid email address

9. Palindrome Checker: Develop a program that determines if a given word or phrase is a palindrome (reads the same forwards and backwards) without using string reversal functions.
Example:
    Input: "racecar"

    Output: "racecar is a palindrome"

    Input: "hello"

    Output: "hello is not a palindrome"

10. Sentence Capitalization: Create a function that capitalizes the first letter of each word in a sentence without using any string methods.

11. URL Parser: Design a program that parses a URL into its components (scheme, host, path, query, etc.) without using any string methods.
Example:
    Input: https://www.google.com/search?q=youtube

    Output:
    Scheme: https
    Host: www.google.com
    Path: /search
    Query: q=youtube

12. Anagram Checker: Write a function that checks if two words are anagrams of each other (contain the same characters in different orders) without using string sorting or manipulation functions.
Example:
    Input: "listen", "silent"

    Output: "listen and silent are anagrams"

    Input: "hello", "goodbye"

    Output: "hello and goodbye are not anagrams"

*/