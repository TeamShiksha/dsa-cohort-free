// Question Link: https://www.interviewbit.com/problems/sum-of-pairwise-hamming-distance/


public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    // Optimal Solution
    public int hammingDistance(final List<Integer> A) {
        final int MOD = 1000000007;
        long totalHammingDistance = 0;

        for (int bitPos = 0; bitPos < 30; bitPos++) {
            long countOnes = 0;

            for (int element : A) {
                if ((element & (1 << bitPos)) != 0) {
                    countOnes++;
                }
            }

            long countZeros = A.size() - countOnes;

            long bitContribution = (countOnes * countZeros * 2) % MOD;

            totalHammingDistance = (totalHammingDistance + bitContribution) % MOD;
        }

        return (int) totalHammingDistance;
    }
    

    /*
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    // Brute Force Solution - you will get TLE
    public int hammingDistance(final List<Integer> A) {
        final int MOD = 1000000007;
        int n = A.size();
        long totalHammingDistance = 0;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                totalHammingDistance += calculateHamming(A.get(i), A.get(j));
                totalHammingDistance %= MOD; // Take modulo at every step
            }
        }

        return (int) totalHammingDistance;
    }

    private int calculateHamming(int num1, int num2) {
        int hammingDist = 0;

        while (num1 > 0 || num2 > 0) {
            int bit1 = num1 & 1; // Last bit of num1
            int bit2 = num2 & 1; // Last bit of num2

            if (bit1 != bit2) {
                hammingDist++;
            }

            num1 >>= 1;
            num2 >>= 1;
        }

        return hammingDist * 2;
    }
    */
}
