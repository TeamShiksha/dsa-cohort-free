// Question Link: https://www.interviewbit.com/problems/wave-array/


public class Solution {
    public ArrayList<Integer> wave(ArrayList<Integer> A) {
       
        // Sort the ArrayList A
        Collections.sort(A);
        
        for (int i = 0; i < A.size() - 1; i += 2) {
            // Swap without using a third variable
            A.set(i, A.get(i) ^ A.get(i + 1));       
            A.set(i + 1, A.get(i) ^ A.get(i + 1));   
            A.set(i, A.get(i) ^ A.get(i + 1));      
        }

        return A;
    }
}
