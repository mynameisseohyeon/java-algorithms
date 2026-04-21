import java.io.*;
import java.util.*;

class Solution {
    public int[] solution(String myString) {
        ArrayList<Integer> arr = new ArrayList<>();
        
        int count = 0;
        for(int i = 0; i < myString.length(); i++) {
        
            if(myString.charAt(i) != 'x') {
                count++;
            } else {
                arr.add(count);
                count = 0;
            }
        }
        arr.add(count);
     
        return arr.stream().mapToInt(i -> i).toArray();
    }
}