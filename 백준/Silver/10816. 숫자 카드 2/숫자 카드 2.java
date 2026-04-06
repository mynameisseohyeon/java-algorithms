import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException { // 숫자 카드2
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Map<Integer, Integer> cardCounts = new HashMap<>(); // 카드 번호, 카드 개수
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < N; i++){ // 카드 번호와 개수 저장
            int card = Integer.parseInt(st.nextToken());
            cardCounts.put(card, cardCounts.getOrDefault(card, 0) + 1);
        }

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < M; i++){
            int target = Integer.valueOf(st.nextToken());
            sb.append(cardCounts.getOrDefault(target, 0)).append(" "); // 카드 개수 출력
        }
        System.out.println(sb.toString().trim());
    }
}