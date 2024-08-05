/**
 * This class contains methods to generate and display Pascal's Triangle using recursion.
 */
public class PascalTriangle {

    /**
     * This method calculates the value at a specific position in Pascal's Triangle.
     * It uses the recursive definition of binomial coefficients:
     * - If either row or col is 0 or if col equals row, the value is 1 (base case).
     * - Otherwise, it is the sum of the values from the previous row (recursive case).
     *
     * @param row The row number in Pascal's Triangle.
     * @param col The column number in Pascal's Triangle.
     * @return The value at the specified position in Pascal's Triangle.
     */
    public int pascal(int row, int col) {
        // Base cases: The first and last elements of each row are 1.
        if (col == 0 || col == row) {
            return 1;
        }
        // Recursive case: Sum of the two elements above the current element.
        return pascal(row - 1, col - 1) + pascal(row - 1, col);
    }

    /**
     * This method prints Pascal's Triangle up to a specified number of rows.
     * It uses the recursive pascal() method to calculate the values.
     *
     * @param rows The number of rows to print in Pascal's Triangle.
     */
    public void printPascalTriangle(int rows) {
        for (int i = 0; i < rows; i++) {
            printRow(i);
            System.out.println();
        }
    }

    /**
     * This method prints a specific row in Pascal's Triangle.
     * It calls the recursive pascal() method to get each value.
     *
     * @param row The row number to print in Pascal's Triangle.
     */
    public void printRow(int row) {
        for (int col = 0; col < row + 1; col++) {
            System.out.print(pascal(row, col) + " ");
        }
    }

    /**
     * The main method to test the Pascal's Triangle generation.
     * It creates an instance of the PascalTriangle class and prints the triangle.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        PascalTriangle pt = new PascalTriangle();
        int numberOfRows = 5; 
        pt.printPascalTriangle(numberOfRows);
    }
}
