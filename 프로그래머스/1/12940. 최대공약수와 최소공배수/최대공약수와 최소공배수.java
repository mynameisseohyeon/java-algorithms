import java.io.*;
import java.util.*;

class Solution {
    public int[] solution(int n, int m) {
        int a = n;
        int b = m;

        while (b != 0) {
            int r = a % b; 
            a = b;
            b = r;
        }
        
        int gcd = a; // 최대 공약수
        int lcm = (n * m) / gcd; // 최소 공배수
        
        int[] answer = {gcd, lcm};
        return answer;
    }
}