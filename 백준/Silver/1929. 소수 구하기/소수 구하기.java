import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        boolean[] isPrime = new boolean[M + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false; // 0과 1은 소수가 아님

        for(int i = 2; i <= Math.sqrt(M); i++){ // 2부터 M의 제곱근까지 반복
            if(isPrime[i] == true) {
                for(int j = i * i; j <= M; j = j + i) { // 소수가 아닐 경우 false로 변경
                    isPrime[j] = false;
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int i = N; i <= M; i++){
            if(isPrime[i] == true) { // i가 소수인 경우
                sb.append(i).append("\n");
            }
        }

        System.out.println(sb.toString());
    }
}