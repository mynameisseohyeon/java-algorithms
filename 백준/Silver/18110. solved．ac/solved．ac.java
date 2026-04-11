import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException { // solved.ac
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] score = new int[N];

        for(int i = 0; i < N; i++){
            String input = br.readLine();
            if(input.equals(" ")){
                score[i] = 0;
            } else {
                score[i] = Integer.parseInt(input);
            }
        }

        Arrays.sort(score); // 오름차순 정렬
        int exclude = (int) Math.round(N * 0.15); // 절사할 개수 계산
        int sum = 0;

        // 상위 15%와 하위 15% 제외
        for(int i = exclude; i < N - exclude; i++) {
            sum += score[i];
        }

        // 절사 평균 구하기
        double average = (double) sum / (N - 2 * exclude);

        // 절사 평균 반올림하기
        System.out.println(Math.round(average));
    }
}