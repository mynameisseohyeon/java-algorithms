import java.io.*;
import java.util.*;

public class Main{ // 10808번 - 알파벳 개수
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String S = br.readLine();
        int[] words = new int[26]; // a ~ z
        
        for(int i = 0; i < S.length(); i++) {
            char c = S.charAt(i); // 한 글자씩 분리
            
            //문자가 알파벳의 몇 번째인지 계산 (아스키 코드 뺄셈)
            int index = c - 'a';
            
            // 해당 문자열 안에 해당하는 번호를 words안에 +1 증가 진행
            words[index]++;
        }

        for(int i = 0; i < words.length; i++) {
            System.out.print(words[i]+ " ");
        }
        
    }
}