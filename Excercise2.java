public class Excercise2 {
    //This method calculates the sum of all integers from 0 to n using recursion.
    public int sum(int n) {
        // Base case: If n is 0, the sum is 0.
        if (n == 0) {
            return 0;
        }
        // Recursive case: Add n to the sum of integers from 0 to n-1.
        else {
            return n + sum(n - 1);
        }
    }
}
