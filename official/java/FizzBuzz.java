// Question Link: https://www.interviewbit.com/problems/fizzbuzz/


public class Solution {
    public ArrayList<String> fizzBuzz(int A) {
        ArrayList<String> result = new ArrayList<String>();
        
        for (int i = 1; i <= A; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                result.add("FizzBuzz");
            } else if (i % 3 == 0) {
                result.add("Fizz");
            } else if (i % 5 == 0) {
                result.add("Buzz");
            } else {
                result.add(Integer.toString(i));
            }
        }
        
        return result;
    }
}
