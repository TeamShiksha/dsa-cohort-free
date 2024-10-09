// Question Link: https://www.interviewbit.com/problems/occurence-of-each-number/


public class Solution {
    public ArrayList<Integer> findOccurences(ArrayList<Integer> A) {
        
        // Sort the ArrayList A
        Collections.sort(A);
        
        // Define ArrayList to store the result
        ArrayList<Integer> result = new ArrayList<>();
        
        int element = A.get(0);
        int count = 0;
        
        for (int i = 0; i < A.size(); i++) {            
            if (A.get(i) != element) {
                result.add(count);
                
                element = A.get(i);
                count = 1;
            } else {
                count++;
            }            
        }
        
        // Add the last element occurrences
        result.add(count);
        
        return result;
    }
}
