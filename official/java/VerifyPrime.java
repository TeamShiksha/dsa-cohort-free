// Question Link: https://www.interviewbit.com/problems/verify-prime/


public class Solution {
    /*
    // Brute Force Solution - TC = O(A), SC = O(1)
    public int isPrime(int A) {
        
        if(A <= 1) {
            return 0;
        }
        
        for (int i = 2; i <= A / 2; i++) {
            if (A % i == 0) {
                return 0;
            }
        }
        
        return 1;
    }
    */
    
    // Optimal Solution - TC = O(sqrt(A)), SC = O(1)
    public int isPrime(int A) {
        
        if(A <= 1) {
            return 0;
        }
        
        for (int i = 2; i * i <= A; i++) {
            if (A % i == 0) {
                return 0;
            }
        }
        
        return 1;
    }
}
