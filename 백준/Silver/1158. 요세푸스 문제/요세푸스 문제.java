import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args)throws IOException { // 요세푸스 문제
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        Queue<Integer> queue = new LinkedList<>();

        for(int  i = 1; i <= N; i++) {
            queue.add(i);
        }

        StringBuilder sb = new StringBuilder();
        sb.append("<");

        while(!queue.isEmpty()) {
            for(int j = 0; j < K - 1; j++) { // K - 1번까지는 앞사람을 맨뒤로 이동
                int temp = queue.poll();
                queue.add(temp);
            }
            // K번째 사람은 꺼낸 후 sb에 추가
            sb.append(queue.poll());

            if(!queue.isEmpty()) {
                sb.append(", ");
            }
        }
        sb.append(">");
        System.out.println(sb.toString());

    }
}