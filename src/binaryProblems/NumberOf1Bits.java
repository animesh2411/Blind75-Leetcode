package binaryProblems;

public class NumberOf1Bits {
    public int hammingWeight1(int n) {
        int remainder = 0;
        int numOf1s = 0;
        StringBuilder binary = new StringBuilder("");
        while (n > 0) {
            remainder = findRemainder(n);
            if(remainder == 1) {
                numOf1s++;
            }
            binary.append(remainder);
            n = n / 2;
        }
        return numOf1s;
    }
    private int findRemainder(int n) {
        if(n%2==0) {
            return 0;
        }
        else return 1;
    }


    public int hammingWeight2(int n) {
        int num1s = 0;
        // Only when n > 0 will there be 1 bits to count
        while (n > 0) {
            // AND n with 1 to check value of rightmost bit
            int rightmostBit = n & 1;
            if (rightmostBit == 1) {
                ++num1s;
            }
            // Remove rightmost bit so that the next bit can be analyzed
            n = n >> 1;
        }
        return num1s;
    }
}
