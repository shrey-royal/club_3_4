// import java.util.Arrays;

public class Basics {
    public static void main(String[] args) {
        int rollNos[];  //declaring an array
        String names[] = new String[5];  //instantiating an array
        char grades[] = {'A', 'B', 'C', 'D', 'E'};  //initializing an array

        rollNos = new int[5];  //instantiating an array

        for (int i = 0; i < 5; i++) {
            rollNos[i] = i + 1;
        }

        names[0] = "Jaynam";
        names[1] = "Krutarth";
        names[2] = "Zafar";
        names[3] = "Jay";
        names[4] = "Shrey";

        // System.out.println("Roll Nos: ");
        // for (int rollNo : rollNos) {
        //     System.out.println(rollNo);
        // }

        // System.out.println("Names: ");
        // for (String name : names) {
        //     System.out.println(name);
        // }

        // System.out.println("Grades: ");
        // for (char grade : grades) {
        //     System.out.println(grade);
        // }


        // for(int i=0; i<names.length; i++) {
        //     System.out.println("Roll No: " + rollNos[i] + " Name: " + names[i] + " Grade: " + grades[i]);
        // }

        for(int i=0; i<rollNos.length; i++) {
            System.out.println(rollNos[i] + ". " + names[i] + " got " + grades[i] + " grade." );
        }

        System.out.println("Length of rollNos array: " + rollNos.length);

        //sort
        int[] numbers = {5, 1, 3, 2, 4};

        System.out.println("Before sorting: ");
        for(int number: numbers) {
            System.out.println(number);
        }

        java.util.Arrays.sort(numbers); //fully qualified class name - no need to import java.util.Arrays
        // Arrays.sort(numbers);    //need to import java.util.Arrays

        System.out.println("After sorting: ");
        for(int number: numbers) {
            System.out.println(number);
        }

        //toString
        // System.out.println("Roll Nos: " + java.util.Arrays.toString(rollNos));

        String rollNosString = java.util.Arrays.toString(rollNos);
        System.out.println("Roll Nos: " + rollNosString);
        System.out.println("Roll Nos: " + rollNos);


    }
}

/*
 * 
 * Arrays in Java:
 * 
 * 1. Arrays are used to store multiple values in a single variable, instead of declaring separate variables for each value.
 * 
 * 2. To declare an array, define the variable type with square brackets:
 * 
 * data_Type var_name[];
 * data_Type[] var_name;
 * data_Type []var_name;
 * 
 * for example:
 * 
 * int rollNos[];
 * 
 * 3. We can also declare an array by specifying the size of the array (it is called instantiating an array).
 * 
 * data_Type[] var_name = new data_Type[size];
 * 
 * int rollNos[] = new int[5];
 * 
 * 4. We can also create an array by using the shortcut syntax (initializing an array):
 * 
 * data_Type[] var_name = {value1, value2, value3, ..., valueN};
 * 
 * //using the array:
 * 
 * var_name[index]; //will return the value stored at the specified index
 * 
 * rollNos[0];  //will return the value stored at the first index
 * 
 * 
 * Array Methods:
 * 
 * 1. length: returns the length of the array
 * 2. sort: sorts the array in ascending order
 * 3. toString: returns the string representation of the array
 * 
 * Task: Write a Java program to find the second smallest and second largest element in an array.
 * 
 * 
 */

