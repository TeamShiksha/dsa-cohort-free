// Question Link: https://www.interviewbit.com/problems/max-min-05542f2f-69aa-4253-9cc7-84eb7bf739c4/


public class Solution {
    // Time Complexity = O(n), Space Complexity = O(1)
    public int solve(int[] A) {
        
        int mini = Integer.MAX_VALUE;
        int maxi = Integer.MIN_VALUE;
        
        for(int i = 0; i < A.length; i++) {
            if(A[i] > maxi) {
                maxi = A[i];
            }
            
            if(A[i] < mini) {
                mini = A[i];
            }
        }
        
        return maxi + mini;
    }
}
