import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException { // 요세푸스 문제 0
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        Queue<Integer> queue = new ArrayDeque<>();

        StringBuilder sb = new StringBuilder();
        for(int i = 1; i <= N; i++) {
            queue.offer(i);
        }

        while(!queue.isEmpty()) {
            for(int i = 0; i < K - 1; i++) {
                queue.offer(queue.poll());
            }

            // K번째 사람 저장
            sb.append(queue.poll());
            
            if(!queue.isEmpty()) { // queue가 비어있지 않은 경우
                sb.append(", ");
            }
        }
        System.out.println("<" + sb.toString() + ">");
    }
}