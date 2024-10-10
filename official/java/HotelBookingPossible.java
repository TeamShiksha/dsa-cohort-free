// Question Link: https://www.interviewbit.com/problems/hotel-bookings-possible/


import java.util.Collections;public class Solution {
    public boolean hotel(ArrayList<Integer> arrive, ArrayList<Integer> depart, int K) {
        
        // Sort the arrival and departure ArrayList
        Collections.sort(arrive);
        Collections.sort(depart);
        
        int rooms = 0;  
        int i = 0, j = 0;  
        int n = arrive.size();  
        
        while (i < n && j < n) {
            if (arrive.get(i) <= depart.get(j)) {
                rooms++;
                i++; 
            } else {
                rooms--; 
                j++;  
            }
            
            if (rooms > K) {
                return false; 
            }
        }
        
        return true;  
    }
}
