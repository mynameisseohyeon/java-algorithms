import java.io.*;
import java.util.*;

class Solution {
    public int solution(String t, String p) {
        int answer = 0;

        for(int i = 0; i <= t.length() - p.length(); i++) {
            String target = t.substring(i, i + p.length());
            Long tLong = Long.parseLong(target);
            Long pLong = Long.parseLong(p);

            if(tLong <= pLong) {
                answer += 1;
            }
        }
        
        return answer;
    }
}