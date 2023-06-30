public class GotoContinue {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
                continue;   // Skip the current iteration and continue with the next iteration
            }
        }
    }
}

/*
 * 1. Goto is not supported in Java. Due to the fact that it makes the code hard to understand and debug.
 * 
 * > Unconditional Jumps
 * 
 * 2. Continue: It is used to skip the current iteration of the loop and continue with the next iteration.
 * 
 */