/**
 * This class contains methods to calculate the Least Common Denominator (LCD) for two fractions.
 */
public class LeastCommonDenominator {

    /**
     * This method calculates the Greatest Common Divisor (GCD) of two integers using recursion.
     *
     * @param a The first integer.
     * @param b The second integer.
     * @return The GCD of the two integers.
     */
    public int gcd(int a, int b) {
        // Base case: If the second number is 0, the GCD is the first number.
        if (b == 0) {
            return a;
        }
        // Recursive case: GCD of b and the remainder of a divided by b.
        return gcd(b, a % b);
    }

    /**
     * This method calculates the Least Common Denominator (LCD) of two fractions.
     *
     * @param denom1 The denominator of the first fraction.
     * @param denom2 The denominator of the second fraction.
     * @return The LCD of the two denominators.
     */
    public int lcd(int denom1, int denom2) {
        // Calculate the LCD using the formula: (denom1 * denom2) / GCD(denom1, denom2).
        return (denom1 * denom2) / gcd(denom1, denom2);
    }

    public static void main(String[] args) {
        LeastCommonDenominator lcdCalculator = new LeastCommonDenominator();
        int denom1 = 12; 
        int denom2 = 18; 
        int lcd = lcdCalculator.lcd(denom1, denom2);
        System.out.println("The Least Common Denominator (LCD) of " + denom1 + " and " + denom2 + " is: " + lcd);
    }
}