// Question Link: https://www.interviewbit.com/problems/rotate-matrix/


public class Solution {
    public void rotate(ArrayList<ArrayList<Integer>> matrix) {
        
        int n = matrix.size();  
        
        // Transpose the matrix
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {                
                // Swap elements at (i, j) and (j, i)
                int temp = matrix.get(i).get(j);
                matrix.get(i).set(j, matrix.get(j).get(i));
                matrix.get(j).set(i, temp);
            }
        }

        // Reverse each row
        for (int i = 0; i < n; i++) {
            int start = 0;  
            int end = n - 1; 
            
            while (start < end) {
                // Swap elements at (i, start) and (i, end)
                int temp = matrix.get(i).get(start);  
                matrix.get(i).set(start, matrix.get(i).get(end));  
                matrix.get(i).set(end, temp);  
                
                start++; 
                end--;  
            }
        }
    }
}
