// Question Link: https://www.interviewbit.com/problems/max-sum-contiguous-subarray/


public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int maxSubArray(final int[] A) {
        int maxSum = Integer.MIN_VALUE;
        int currSum = 0;
    
        for (int i=0; i <A.length; i++) {
            currSum = currSum + A[i];
            
            if (maxSum < currSum) {
                maxSum = currSum; 
            }
            
            if (currSum < 0) {
                currSum = 0;
            }
        }
        
        return maxSum;
    }
}
