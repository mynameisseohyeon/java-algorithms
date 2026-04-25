import java.io.*;
import java.util.*;

class Solution {
    public int[] solution(long n) {

        String num = String.valueOf(n);
        int len = num.length();
        int[] answer = new int[len];

        for(int i = 0; i < len; i++) {
            answer[i] = num.charAt(len - 1 - i) - '0';
        }
        
        return answer;
    }
}