import java.io.*;
import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        
        for(int i = 0; i < s.length(); i++) {
            int position = -1;
            for(int j = i - 1; j >= 0; j--) {
                if(s.charAt(i) == s.charAt(j)) { // 자신 앞에 같은 글자가 있을 경우
                    // 자신보다 몇 칸 앞에 위치해 있는지
                    position = i - j; // 현재 위치 - 찾은 위치
                    break;
                }
            }
            answer[i] = position;
        }
        return answer;
    }
}