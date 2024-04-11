package binaryProblems;

public class SumOfTwoIntegersWithoutArithmeticOperations {
    public int getSum(int a, int b) {

        // Base case: if b is 0, return a
        if (b == 0)
            return a;

        // Sum without considering carry
        int sum = a ^ b;

        // Carry is shifted by one so that adding it to sum gives the required sum
        int carry = (a & b) << 1;

        // Recursively call getSum with sum and carry until carry becomes 0
        return getSum(sum, carry);
    }
}
