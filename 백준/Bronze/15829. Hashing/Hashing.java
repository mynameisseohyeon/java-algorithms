import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException { // Hashing
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int L = Integer.parseInt(br.readLine()); // 문자열 길이
        String s = br.readLine();
        long M = 1234567891;
        long result = 0;
        long power = 1; // 31^i

        for(int i = 0; i < L; i++) {
            int num = s.charAt(i) - 'a' + 1; // a는 1, b는 2, ... z는 26
            result = (result + (num * power)) % M; // 오버플로우 방지
            power = power * 31 % M; // 다음 자리수의 가중치 계산
        }
        System.out.println(result);

    }
}