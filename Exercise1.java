public class Exercise1{
    //This method effectively multiplies a by b because it adds a to itself b times.
    public int mystery(int a, int b) {
        // Base case: If b is 1, the recursion stops, and the method returns a.
        if (b == 1) {
            return a;
        }
        // Recursive case: If b is not 1, the method calls itself with b decremented by 1,
        // and adds the result to a. This continues until b becomes 1.
        else {
            return a + mystery(a, b - 1);
        }
    }
}