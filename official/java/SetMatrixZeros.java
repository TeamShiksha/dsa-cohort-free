// Question Link: https://www.interviewbit.com/problems/set-matrix-zeros/


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
