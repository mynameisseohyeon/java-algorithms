import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException { // 팩토리얼 0의 개수
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int count = 0;

        for(int i = 1; i <= N; i++) {
            int num = i;

            while(num % 5 == 0) { // 5로 나누어 떨어지는 경우
                count += 1; // 5의 개수 카운트
                num /= 5; // 다음으로 나눌 수 있는 5의 개수를 찾기 위해 나눔
            }
        }
        System.out.println(count);

    }
}