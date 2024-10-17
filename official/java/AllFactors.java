// Question Link: https://www.interviewbit.com/problems/all-factors/


public class Solution {
    /*
    // Brute Force Solution - TC = O(A), SC = O(1)
    public ArrayList<Integer> allFactors(int A) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        
        for (int i = 1; i <= A / 2; i++) {
            if (A % i == 0) {
                result.add(i);
            }
        }
        
        result.add(A);        
        return result;
    }
    */
    
    // Optimal Solution - TC = O(sqrt(A)), SC = O(1)
    public ArrayList<Integer> allFactors(int A) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        
        int i = 1;
        
        // Iterate from 1 to sqrt(A) and add the divisors smaller than sqrt(A) to the result list
        while (i * i < A) {
            if (A % i == 0) {
                result.add(i);
            }
            
            i++;
        }
        
        // Check if the number of factors is a perfect square(9, 16, 25, 36...) to avoid adding the square root twice
        if (i - (A / i) == 1) {
            i--;
        }
        
        // Iterate in reverse order from sqrt(A) to 1
        while(i >= 1) {
            if (A % i == 0) {
                result.add(A / i);
            }   
            
            i--;
        }
        
        return result;
    }
}
