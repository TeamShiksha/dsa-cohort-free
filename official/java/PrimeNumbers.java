// Question Link: https://www.interviewbit.com/problems/prime-numbers/



public class Solution {
    
    public boolean isPrime(int n) {
        
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        
        return true;
    }
    
    public ArrayList<Integer> sieve(int A) {
        
        ArrayList<Integer> result = new ArrayList<>();
        
        for (int i = 2; i <= A; i++) {
            if (isPrime(i)) {
                result.add(i);
            }
        }
        
        return result;
    }
}
