// Question Link: https://www.interviewbit.com/problems/set-matrix-zeros/


// Optimal Solution - TC = O(n^2), SC = O(1)
public class Solution {
    public void setZeroes(ArrayList<ArrayList<Integer>> matrix) {
        boolean firstColZero = false;
        
        int n = matrix.size();        
        int m = matrix.get(0).size(); 

        for (int i = 0; i < n; i++) {
            if (matrix.get(i).get(0) == 0) {
                firstColZero = true; 
            }
            
            for (int j = 1; j < m; j++) {
                if (matrix.get(i).get(j) == 0) {
                    matrix.get(i).set(0, 0); 
                    matrix.get(0).set(j, 0); 
                }
            }
        }

        for (int i = n - 1; i >= 0; i--) {
            for (int j = m - 1; j >= 1; j--) {
                if (matrix.get(i).get(0) == 0 || matrix.get(0).get(j) == 0) {
                    matrix.get(i).set(j, 0); // Zero the cell
                }
            }
            
            if (firstColZero) {
                matrix.get(i).set(0, 0);
            }
        }
    }
}


/*
// Brute Force Solution - TC = O(n^2), SC = O(m + n)
public class Solution {
    public void setZeroes(ArrayList<ArrayList<Integer>> a) {
        int rows = a.size();
        int cols = a.get(0).size();
        
        boolean[] rowsZero = new boolean[rows];
        boolean[] colsZero = new boolean[cols];
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                
                if (a.get(i).get(j) == 0) {
                    rowsZero[i] = true;
                    colsZero[j] = true;
                }
            }
        }
        
        for (int i = 0; i < rows; i++) {
            if (rowsZero[i]) {
                for (int j = 0; j < cols; j++) {
                    a.get(i).set(j, 0);
                }
            }
        }
        
        for (int j = 0; j < cols; j++) {
            if (colsZero[j]) {
                for (int i = 0; i < rows; i++) {
                    a.get(i).set(j, 0);
                }
            }
        }
    }
}
*/
