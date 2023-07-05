import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int[] numbers = {1, -2, 0, 5, -1, -4};  //[1, -2, 0, 5, -1, -4]
        int target = 2;

        findTriplets(numbers, target);
    }

    public static void findTriplets(int[] array, int target) {
        int length = array.length;

        // sort the array
        Arrays.sort(array); //[-4, -2, -1, 0, 1, 5]

        // Iterate through the array, fixing the first element of the triplet
        for (int i=0; i<length-2; i++) {
            //skip duplicates for the first element
            if (i > 0 && array[i] == array[i-1])
                continue;
            
            int left = i+1; //pointer to the second element
            int right = length-1; //pointer to the third element

            while (left < right)  {
                int sum = array[i] + array[left] + array[right];

                if (sum == target) {
                    System.out.println("[" + array[i] + ", " + array[left] + ", " + array[right] + "]");
                    left++;
                    right--;

                    //skip duplicates for the second element
                    while (left < right && array[left] == array[left-1])
                        left++;

                    //skip duplicates for the third element
                    while (left < right && array[right] == array[right+1])
                        right--;
                } else if (sum < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }
    }
}

/*
Write a Java program to find all the distinct triplets such that the sum of all the three elements [x, y, z (x ≤ y ≤ z)] equal to a specified number.
Sample array: [1, -2, 0, 5, -1, -4]
Target value: 2. 

Expected Output:
[[1, 5, -4], [-2, 5, -1]]  
*/