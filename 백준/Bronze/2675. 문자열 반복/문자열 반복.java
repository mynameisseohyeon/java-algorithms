import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        // 테스트 케이스 개수
        int S = Integer.parseInt(bf.readLine());

        for (int i = 0; i < S; i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine());

            // 반복 횟수 R
            int R = Integer.parseInt(st.nextToken());
            // 반복할 문자열 P
            String P = st.nextToken();
            
            String[] locationSt = P.split("");

            // 문자열 길이만큼 반복
            for (int j = 0; j < locationSt.length; j++) {
                // 해당 글자를 R번 반복해서 출력
                for (int k = 0; k < R; k++) {
                    System.out.print(locationSt[j]);
                }
            }
            System.out.println();
            
        }
    }
} 