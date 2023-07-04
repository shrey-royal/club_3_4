/* Write a Java program to find duplicate values in an array of string values. */

public class Task1 {
    public static void main(String[] args) {
        String names[] = {"Sophie", "Olivia", "Luis", "Louisa", "Ronnie", "Martha", "Luis", "Sophie", "Olivia", "Luis", "Louisa", "Ronnie", "Martha", "Luis"};

        // String names[] = {"apple", "banana", "orange", "apple", "grape", "banana"};
        String dup_names[] = new String[names.length];

        for (int i=0; i<names.length-1; i++) {
            for (int j=i+1; j<names.length; j++) {
                if (names[i].equals(names[j])) {
                    for (int k=0; k < dup_names.length; k++) {
                        if (dup_names[k] == names[i]) {
                            break;
                        } else if (dup_names[k] == null) {
                            dup_names[k] = names[i];
                            break;
                        }
                    }
                }
            }
        }
        // System.out.println(Arrays.toString(dup_names));
        for (String string : dup_names) {
            if (string != null) {
                System.out.println(string);
            }
            // System.out.println(string);
        }

    }
}

/*
Write a Java program to find all the distinct triplets such that the sum of all the three elements [x, y, z (x ≤ y ≤ z)] equal to a specified number.
Sample array: [1, -2, 0, 5, -1, -4]
Target value: 2. 
*/