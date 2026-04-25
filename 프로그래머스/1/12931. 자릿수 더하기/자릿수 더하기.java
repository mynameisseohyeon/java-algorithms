import java.util.*;

public class Solution {
    public int solution(int n) {
        String num = String.valueOf(n);
        int sum = 0;
        for(int i = 0; i < num.length(); i++) {
            sum += Integer.parseInt(num.charAt(i) + "");
        }
        
        return sum;
    }
}