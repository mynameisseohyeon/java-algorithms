import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args)throws IOException { // ISBN
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String isbn = br.readLine();
        int sum = 0;
        int index = 0;

        for(int i = 0; i < 13; i++) {
            char ch = isbn.charAt(i);
            if(ch == '*') {
                index = i; // * 위치 저장
            } else {
                int num = ch - '0'; // 문자 -> 숫자
                if(i % 2 == 0) {
                    // 위치가 짝수일 경우
                    sum += num * 1;
                } else {
                    // 위치가 홀수일 경우
                    sum += num * 3;
                }
            }
        }
        // * 자리에 곱해질 가중치 구하기
        int weight = (index % 2 == 0) ? 1 : 3;

        // 0부터 9까지 넣어보면서 10의 배수가 되는 숫자 찾기
        for(int i = 0; i <= 9; i++) {
            if((sum + i * weight) % 10 == 0) {
                System.out.println(i);
                break;
            }
        }
    }
}